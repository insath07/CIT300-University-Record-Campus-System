package queue;

import model.Student;

public class StudentQueue {

    private class Node {
        Student student;
        Node next;

        Node(Student student) {
            this.student = student;
            this.next = null;
        }
    }

    private Node front;
    private Node rear;
    private int size;

    // Enqueue Student
    public boolean enqueue(Student student) {

        if (student == null) {
            System.out.println("Cannot enqueue null student.");
            return false;
        }

        Node newNode = new Node(student);

        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;

        System.out.println("Student enqueued successfully.");
        return true;
    }

    // Dequeue Student
    public Student dequeue() {

        if (front == null) {
            System.out.println("Queue is empty.");
            return null;
        }

        Student student = front.student;

        front = front.next;

        if (front == null) {
            rear = null;
        }

        size--;

        System.out.println("Student dequeued successfully.");
        return student;
    }

    // Peek Student
    public Student peek() {

        if (front == null) {
            System.out.println("Queue is empty.");
            return null;
        }

        return front.student;
    }

    // Check if Queue is Empty
    public boolean isEmpty() {
        return front == null;
    }

    // Get Queue Size
    public int size() {
        return size;
    }

    // Display Queue
    public void displayQueue() {

        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }

        Node current = front;

        System.out.println("\n===== Student Queue =====");

        while (current != null) {
            System.out.println(current.student);
            current = current.next;
        }

        System.out.println("=========================\n");
    }
}