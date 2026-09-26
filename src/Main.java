import model.Student;
import linkedlist.StudentLinkedList;

public class Main {

    public static void main(String[] args) {

        StudentLinkedList studentList = new StudentLinkedList();

        System.out.println("=================================");
        System.out.println(" UNIVERSITY STUDENT RECORD SYSTEM");
        System.out.println(" Linked List Module - Member 1");
        System.out.println("=================================\n");

        // Add Students
        System.out.println("1. Adding Students");

        studentList.addStudent(
                new Student("23DA2-001", "Ahmed", "Computer Science", 78.5)
        );

        studentList.addStudent(
                new Student("23DA2-002", "Fathima", "Information Technology", 85.0)
        );

        studentList.addStudent(
                new Student("23DA2-003", "Mohamed", "Software Engineering", 67.5)
        );

        // Display Students
        System.out.println("\n2. Display All Students");
        studentList.displayStudents();

        // Search Student
        System.out.println("3. Search Student");

        Student foundStudent = studentList.searchStudent("23DA2-002");

        if (foundStudent != null) {
            System.out.println("Student Found:");
            System.out.println(foundStudent);
        } else {
            System.out.println("Student not found.");
        }

        // Update Student
        System.out.println("\n4. Update Student");

        studentList.updateStudent(
                "23DA2-002",
                "Fathima Updated",
                "Computer Science",
                90.0
        );

        // Display after update
        System.out.println("\nStudents after update:");
        studentList.displayStudents();

        // Delete Student
        System.out.println("5. Delete Student");

        studentList.deleteStudent("23DA2-003");

        // Display after delete
        System.out.println("\nStudents after deletion:");
        studentList.displayStudents();

        // Check size
        System.out.println("6. Student Count");
        System.out.println("Total Students: " + studentList.size());

        // Check empty
        System.out.println("\n7. Check List");
        System.out.println("Is list empty? " + studentList.isEmpty());

        // Test duplicate ID
        System.out.println("\n8. Test Duplicate Student ID");

        studentList.addStudent(
                new Student("23DA2-001", "Another Student", "IT", 70.0)
        );

        // Test invalid marks
        System.out.println("\n9. Test Invalid Marks");

        studentList.addStudent(
                new Student("23DA2-004", "Test Student", "IT", 120.0)
        );

        System.out.println("\n=================================");
        System.out.println(" Linked List Testing Completed");
        System.out.println("=================================");
    }
}