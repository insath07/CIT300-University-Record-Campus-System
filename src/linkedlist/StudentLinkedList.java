package linkedlist;

import model.Student;

public class StudentLinkedList {

    private class Node {
        Student student;
        Node next;

        Node(Student student) {
            this.student = student;
            this.next = null;
        }
    }

    private Node head;

    // Add Student
    public boolean addStudent(Student student) {

        // Check invalid marks
        if (student.getMarks() < 0 || student.getMarks() > 100) {
            System.out.println("Invalid marks. Marks must be between 0 and 100.");
            return false;
        }

        // Empty list
        if (head == null) {
            head = new Node(student);
            System.out.println("Student added successfully.");
            return true;
        }

        // Check duplicate ID
        Node current = head;

        while (current != null) {

            if (current.student.getStudentId()
                    .equalsIgnoreCase(student.getStudentId())) {

                System.out.println("Duplicate Student ID. Student already exists.");
                return false;
            }

            current = current.next;
        }

        // Add at end
        current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = new Node(student);

        System.out.println("Student added successfully.");
        return true;
    }

    // Update Student
    public boolean updateStudent(
            String studentId,
            String name,
            String programme,
            double marks) {

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks. Marks must be between 0 and 100.");
            return false;
        }

        Node current = head;

        while (current != null) {

            if (current.student.getStudentId()
                    .equalsIgnoreCase(studentId)) {

                current.student.setName(name);
                current.student.setProgramme(programme);
                current.student.setMarks(marks);

                System.out.println("Student updated successfully.");
                return true;
            }

            current = current.next;
        }

        System.out.println("Student not found.");
        return false;
    }

    // Delete Student
    public boolean deleteStudent(String studentId) {

        if (head == null) {
            System.out.println("Student list is empty.");
            return false;
        }

        // Delete first student
        if (head.student.getStudentId()
                .equalsIgnoreCase(studentId)) {

            head = head.next;

            System.out.println("Student deleted successfully.");
            return true;
        }

        Node current = head;

        while (current.next != null) {

            if (current.next.student.getStudentId()
                    .equalsIgnoreCase(studentId)) {

                current.next = current.next.next;

                System.out.println("Student deleted successfully.");
                return true;
            }

            current = current.next;
        }

        System.out.println("Student not found.");
        return false;
    }

    // Search Student
    public Student searchStudent(String studentId) {

        Node current = head;

        while (current != null) {

            if (current.student.getStudentId()
                    .equalsIgnoreCase(studentId)) {

                return current.student;
            }

            current = current.next;
        }

        return null;
    }

    // Display All Students
    public void displayStudents() {

        if (head == null) {
            System.out.println("No student records available.");
            return;
        }

        Node current = head;

        System.out.println("\n===== Student Records =====");

        while (current != null) {

            System.out.println(current.student);

            current = current.next;
        }

        System.out.println("===========================\n");
    }

    // Check whether list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Count students
    public int size() {

        int count = 0;
        Node current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }
}