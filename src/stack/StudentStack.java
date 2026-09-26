package stack;

import model.Student;

public class StudentStack {

    private class Node {
        Student student;
        Node next;

        Node(Student student) {
            this.student = student;
            this.next = null;
        }
    }

    private Node top;
    private int size;

    // Push Student
    public boolean push(Student student) {

        if (student == null) {
            System.out.println("Cannot push null student.");
            return false;
        }

        Node newNode = new Node(student);
        newNode.next = top;
        top = newNode;
        size++;

        System.out.println("Student pushed successfully.");
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

        System.out.println("Student popped successfully.");
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

    // Check if Stack is Empty
    public boolean isEmpty() {
        return top == null;
    }

    // Get Stack Size
    public int size() {
        return size;
    }

    // Display Stack
    public void displayStack() {

        if (top == null) {
            System.out.println("Stack is empty.");
            return;
        }

        Node current = top;

        System.out.println("\n===== Student Stack =====");

        while (current != null) {
            System.out.println(current.student);
            current = current.next;
        }

        System.out.println("=========================\n");
    }
}