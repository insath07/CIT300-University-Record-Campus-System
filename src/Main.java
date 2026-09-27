import graph.CampusGraph;
import hashing.StudentHashTable;
import java.util.Scanner;
import linkedlist.StudentLinkedList;
import model.Student;
import queue.StudentQueue;
import stack.StudentStack;
import tree.StudentBST;

/** Menu-driven application that integrates every required data structure. */
public class Main {
    private final StudentLinkedList students = new StudentLinkedList();
    private final StudentStack actions = new StudentStack();
    private final StudentQueue serviceRequests = new StudentQueue();
    private final StudentBST studentTree = new StudentBST();
    private final StudentHashTable studentIndex = new StudentHashTable();
    private final CampusGraph campus = new CampusGraph();
    private final Scanner input = new Scanner(System.in);

    public static void main(String[] args) { new Main().run(); }

    private void run() {
        System.out.println("==============================================");
        System.out.println(" UNIVERSITY RECORD & CAMPUS ROUTE MANAGEMENT");
        System.out.println("==============================================");
        boolean running = true;
        while (running) {
            printMenu();
            switch (readInt("Choose an option: ", 1, 16)) {
                case 1: addStudent(); break;
                case 2: updateStudent(); break;
                case 3: deleteStudent(); break;
                case 4: students.displayStudents(); break;
                case 5: addServiceRequest(); break;
                case 6: processServiceRequest(); break;
                case 7: actions.displayStack(); break;
                case 8: studentTree.inorder(); break;
                case 9: searchUsingHashing(); break;
                case 10: campus.addLocation(readRequired("Location name: ")); break;
                case 11: campus.removeLocation(readRequired("Location name to remove: ")); break;
                case 12: addConnection(); break;
                case 13: removeConnection(); break;
                case 14: campus.displayGraph(); break;
                case 15: campus.bfs(readRequired("Starting location: ")); break;
                case 16: running = false; break;
                default: break;
            }
        }
        System.out.println("Thank you. System closed.");
    }

    private void printMenu() {
        System.out.println("\n1. Add Student Record\n2. Update Student Record\n3. Delete Student Record");
        System.out.println("4. Display All Records using Linked List\n5. Add Service Request to Queue");
        System.out.println("6. Process Next Service Request\n7. Display Recent Actions using Stack");
        System.out.println("8. Display Students using BST\n9. Search Student using Hashing");
        System.out.println("10. Add Campus Location\n11. Remove Campus Location");
        System.out.println("12. Add Campus Connection/Road\n13. Remove Campus Connection/Road");
        System.out.println("14. Display Campus Connections\n15. Traverse Campus Locations (BFS)\n16. Exit");
    }

    private void addStudent() {
        Student student = readStudent();
        if (students.addStudent(student)) {
            studentTree.insert(student);
            studentIndex.insert(student);
            actions.push(student, "Added student record");
        }
    }

    private void updateStudent() {
        String id = readRequired("Student ID to update: ");
        Student existing = students.searchStudent(id);
        if (existing == null) { System.out.println("Student not found."); return; }
        if (students.updateStudent(id, readRequired("New name: "), readRequired("New programme: "), readMarks())) {
            actions.push(existing, "Updated student record");
        }
    }

    private void deleteStudent() {
        String id = readRequired("Student ID to delete: ");
        Student existing = students.searchStudent(id);
        if (existing != null && students.deleteStudent(id)) {
            studentTree.delete(id);
            studentIndex.delete(id);
            actions.push(existing, "Deleted student record");
        } else if (existing == null) System.out.println("Student not found.");
    }

    private void addServiceRequest() {
        Student student = students.searchStudent(readRequired("Student ID for the service request: "));
        if (student == null) { System.out.println("Student not found. Add the record first."); return; }
        serviceRequests.enqueue(student);
        System.out.println("Service request added for " + student.getName() + ".");
    }

    private void processServiceRequest() {
        Student student = serviceRequests.dequeue();
        if (student != null) {
            actions.push(student, "Processed service request");
            System.out.println("Service request processed for " + student.getName() + ".");
        }
    }

    private void searchUsingHashing() {
        Student student = studentIndex.search(readRequired("Student ID to search: "));
        System.out.println(student == null ? "Student not found." : "Student found: " + student);
    }

    private void addConnection() {
        String from = readRequired("First location: ");
        String to = readRequired("Second location: ");
        campus.addRoute(from, to, readInt("Distance in metres: ", 1, Integer.MAX_VALUE));
    }

    private void removeConnection() {
        campus.removeRoute(readRequired("First location: "), readRequired("Second location: "));
    }

    private Student readStudent() {
        return new Student(readRequired("Student ID: "), readRequired("Name: "),
                readRequired("Programme: "), readMarks());
    }

    private double readMarks() {
        while (true) {
            System.out.print("Marks (0-100): ");
            try {
                double marks = Double.parseDouble(input.nextLine().trim());
                if (marks >= 0 && marks <= 100) return marks;
            } catch (NumberFormatException ignored) { }
            System.out.println("Invalid marks. Enter a value from 0 to 100.");
        }
    }

    private int readInt(String prompt, int minimum, int maximum) {
        while (true) {
            System.out.print(prompt);
            try {
                int value = Integer.parseInt(input.nextLine().trim());
                if (value >= minimum && value <= maximum) return value;
            } catch (NumberFormatException ignored) { }
            System.out.println("Invalid option. Enter a number between " + minimum + " and " + maximum + ".");
        }
    }

    private String readRequired(String prompt) {
        while (true) {
            System.out.print(prompt);
            String value = input.nextLine().trim();
            if (!value.isEmpty()) return value;
            System.out.println("This value cannot be empty.");
        }
    }
}
