package stack;

import model.Student;

public class StudentStack {

    private class Node {
        Student student;
        String action;
        Node next;

        Node(Student student, String action) {
            this.student = student;
            this.action = action;
            this.next = null;
        }
    }

    private Node top;
    private int size;

    // Push Student
    public boolean push(Student student) {
        return push(student, "Student action");
    }

    // Push Student with action history
    public boolean push(Student student, String action) {

        if (student == null) {
            System.out.println("Cannot push null student.");
            return false;
        }

        if (action == null || action.trim().isEmpty()) {
            action = "Student action";
        }

        Node newNode = new Node(student, action);

        newNode.next = top;
        top = newNode;
        size++;

        return true;
    }

    // Pop Student
    public Student pop() {

        if (top == null) {
            System.out.println("Stack is empty.");
            return null;
        }

        Student student = top.student;

        top = top.next;
        size--;

        System.out.println("Student action removed from history.");

        return student;
    }

    // Peek Student
    public Student peek() {

        if (top == null) {
            System.out.println("Stack is empty.");
            return null;
        }

        return top.student;
    }

    // Get latest action
    public String peekAction() {

        if (top == null) {
            return null;
        }

        return top.action;
    }

    // Check if Stack is Empty
    public boolean isEmpty() {
        return top == null;
    }

    // Get Stack Size
    public int size() {
        return size;
    }

    // Display Stack with action history
    public void displayStack() {

        if (top == null) {
            System.out.println("Action history is empty.");
            return;
        }

        Node current = top;

        System.out.println("\n===== Recent Action History =====");

        while (current != null) {

            System.out.println(
                    "Action: " + current.action
                    + " | " + current.student
            );

            current = current.next;
        }

        System.out.println("=================================\n");
    }
}