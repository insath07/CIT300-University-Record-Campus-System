package hashing;

import model.Student;

public class StudentHashTable {

    private static final int TABLE_SIZE = 10;

    private class Entry {
        Student student;
        Entry next;

        Entry(Student student) {
            this.student = student;
            this.next = null;
        }
    }

    private Entry[] table;

    public StudentHashTable() {
        table = new Entry[TABLE_SIZE];
    }

    // Hash Function
    private int hash(String studentId) {

        int hashValue = 0;

        for (int i = 0; i < studentId.length(); i++) {
            hashValue = (hashValue * 31 + studentId.charAt(i))
                    % TABLE_SIZE;
        }

        return Math.abs(hashValue);
    }

    // Insert Student
    public boolean insert(Student student) {

        if (student == null) {
            System.out.println("Cannot insert null student.");
            return false;
        }

        int index = hash(student.getStudentId());

        Entry current = table[index];

        // Check duplicate
        while (current != null) {

            if (current.student.getStudentId()
                    .equalsIgnoreCase(student.getStudentId())) {

                System.out.println("Duplicate Student ID. Student already exists.");
                return false;
            }

            current = current.next;
        }

        Entry newEntry = new Entry(student);

        // Empty bucket
        if (table[index] == null) {
            table[index] = newEntry;
        } else {

            current = table[index];

            while (current.next != null) {
                current = current.next;
            }

            current.next = newEntry;
        }

        System.out.println("Student inserted successfully.");
        return true;
    }

    // Search Student
    public Student search(String studentId) {

        int index = hash(studentId);

        Entry current = table[index];

        while (current != null) {

            if (current.student.getStudentId()
                    .equalsIgnoreCase(studentId)) {

                return current.student;
            }

            current = current.next;
        }

        return null;
    }

    // Delete Student
    public boolean delete(String studentId) {

        int index = hash(studentId);

        Entry current = table[index];
        Entry previous = null;

        while (current != null) {

            if (current.student.getStudentId()
                    .equalsIgnoreCase(studentId)) {

                if (previous == null) {
                    table[index] = current.next;
                } else {
                    previous.next = current.next;
                }

                System.out.println("Student deleted successfully.");
                return true;
            }

            previous = current;
            current = current.next;
        }

        System.out.println("Student not found.");
        return false;
    }

    // Display Hash Table
    public void displayTable() {

        System.out.println("\n===== Student Hash Table =====");

        for (int i = 0; i < TABLE_SIZE; i++) {

            System.out.print("Index " + i + ": ");

            Entry current = table[i];

            if (current == null) {
                System.out.println("Empty");
                continue;
            }

            while (current != null) {

                System.out.print(
                        "[" + current.student.getStudentId()
                        + " - " + current.student.getName() + "]"
                );

                if (current.next != null) {
                    System.out.print(" -> ");
                }

                current = current.next;
            }

            System.out.println();
        }

        System.out.println("==============================\n");
    }

    // Check whether table is empty
    public boolean isEmpty() {

        for (Entry entry : table) {
            if (entry != null) {
                return false;
            }
        }

        return true;
    }
}