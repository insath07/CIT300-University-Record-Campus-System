package tree;

import model.Student;

public class StudentBST {

    private class Node {
        Student student;
        Node left;
        Node right;

        Node(Student student) {
            this.student = student;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;

    // Insert Student
    public boolean insert(Student student) {

        if (student == null) {
            System.out.println("Cannot insert null student.");
            return false;
        }

        if (root == null) {
            root = new Node(student);
            System.out.println("Student inserted successfully.");
            return true;
        }

        return insertRecursive(root, student);
    }

    private boolean insertRecursive(Node current, Student student) {

        int comparison = student.getStudentId()
                .compareToIgnoreCase(current.student.getStudentId());

        // Duplicate ID
        if (comparison == 0) {
            System.out.println("Duplicate Student ID. Student already exists.");
            return false;
        }

        // Insert left
        if (comparison < 0) {

            if (current.left == null) {
                current.left = new Node(student);
                System.out.println("Student inserted successfully.");
                return true;
            }

            return insertRecursive(current.left, student);
        }

        // Insert right
        if (current.right == null) {
            current.right = new Node(student);
            System.out.println("Student inserted successfully.");
            return true;
        }

        return insertRecursive(current.right, student);
    }

    // Search Student
    public Student searchStudent(String studentId) {

        Node current = root;

        while (current != null) {

            int comparison = studentId
                    .compareToIgnoreCase(current.student.getStudentId());

            if (comparison == 0) {
                return current.student;
            }

            if (comparison < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        return null;
    }

    // Inorder Traversal
    public void inorder() {

        if (root == null) {
            System.out.println("BST is empty.");
            return;
        }

        System.out.println("\n===== Inorder Traversal =====");
        inorderRecursive(root);
        System.out.println("=============================\n");
    }

    private void inorderRecursive(Node current) {

        if (current == null) {
            return;
        }

        inorderRecursive(current.left);
        System.out.println(current.student);
        inorderRecursive(current.right);
    }

    // Preorder Traversal
    public void preorder() {

        if (root == null) {
            System.out.println("BST is empty.");
            return;
        }

        System.out.println("\n===== Preorder Traversal =====");
        preorderRecursive(root);
        System.out.println("==============================\n");
    }

    private void preorderRecursive(Node current) {

        if (current == null) {
            return;
        }

        System.out.println(current.student);
        preorderRecursive(current.left);
        preorderRecursive(current.right);
    }

    // Postorder Traversal
    public void postorder() {

        if (root == null) {
            System.out.println("BST is empty.");
            return;
        }

        System.out.println("\n===== Postorder Traversal =====");
        postorderRecursive(root);
        System.out.println("===============================\n");
    }

    private void postorderRecursive(Node current) {

        if (current == null) {
            return;
        }

        postorderRecursive(current.left);
        postorderRecursive(current.right);
        System.out.println(current.student);
    }

    // Check if BST is empty
    public boolean isEmpty() {
        return root == null;
    }
}