import model.Student;
import tree.StudentBST;

public class BSTMain {

    public static void main(String[] args) {

        StudentBST bst = new StudentBST();

        System.out.println("=================================");
        System.out.println(" STUDENT RECORD SYSTEM");
        System.out.println(" BST Module - Member 3");
        System.out.println(" H.M. Harshath - 23DA2");
        System.out.println("=================================\n");

        // Insert Students
        System.out.println("1. Insert Students");

        bst.insert(
                new Student("23DA2-050", "Kamal", "Software Engineering", 75.0)
        );

        bst.insert(
                new Student("23DA2-030", "Aisha", "Information Technology", 82.5)
        );

        bst.insert(
                new Student("23DA2-070", "Ahmed", "Computer Science", 78.0)
        );

        bst.insert(
                new Student("23DA2-020", "Fathima", "Data Science", 88.0)
        );

        bst.insert(
                new Student("23DA2-040", "Mohamed", "Cyber Security", 91.0)
        );

        // Inorder
        System.out.println("\n2. Inorder Traversal");
        bst.inorder();

        // Preorder
        System.out.println("3. Preorder Traversal");
        bst.preorder();

        // Postorder
        System.out.println("4. Postorder Traversal");
        bst.postorder();

        // Search
        System.out.println("5. Search Student");

        Student foundStudent = bst.searchStudent("23DA2-040");

        if (foundStudent != null) {
            System.out.println("Student Found:");
            System.out.println(foundStudent);
        } else {
            System.out.println("Student not found.");
        }

        // Search missing student
        System.out.println("\n6. Search Missing Student");

        Student missingStudent = bst.searchStudent("23DA2-999");

        if (missingStudent != null) {
            System.out.println("Student Found:");
            System.out.println(missingStudent);
        } else {
            System.out.println("Student not found.");
        }

        // Duplicate test
        System.out.println("\n7. Test Duplicate Student ID");

        bst.insert(
                new Student("23DA2-050", "Another Student", "IT", 70.0)
        );

        // Empty check
        System.out.println("\n8. Check BST");
        System.out.println("Is BST Empty? " + bst.isEmpty());

        System.out.println("\n=================================");
        System.out.println(" BST Testing Completed");
        System.out.println("=================================");
    }
}