import model.Student;
import hashing.StudentHashTable;

public class HashingMain {

    public static void main(String[] args) {

        StudentHashTable hashTable = new StudentHashTable();

        System.out.println("=================================");
        System.out.println(" STUDENT RECORD SYSTEM");
        System.out.println(" Hashing Module - Member 3");
        System.out.println(" H.M. Harshath - 23DA2");
        System.out.println("=================================\n");

        System.out.println("1. Insert Students");

        hashTable.insert(
                new Student("23DA2-010", "Kamal", "Software Engineering", 75.0)
        );

        hashTable.insert(
                new Student("23DA2-020", "Aisha", "Information Technology", 82.5)
        );

        hashTable.insert(
                new Student("23DA2-030", "Ahmed", "Computer Science", 78.0)
        );

        hashTable.insert(
                new Student("23DA2-040", "Fathima", "Data Science", 88.0)
        );

        hashTable.insert(
                new Student("23DA2-050", "Mohamed", "Cyber Security", 91.0)
        );

        System.out.println("\n2. Display Hash Table");

        hashTable.displayTable();

        System.out.println("3. Search Student");

        Student foundStudent = hashTable.search("23DA2-030");

        if (foundStudent != null) {
            System.out.println("Student Found:");
            System.out.println(foundStudent);
        } else {
            System.out.println("Student not found.");
        }

        System.out.println("\n4. Search Missing Student");

        Student missingStudent = hashTable.search("23DA2-999");

        if (missingStudent != null) {
            System.out.println("Student Found:");
            System.out.println(missingStudent);
        } else {
            System.out.println("Student not found.");
        }

        System.out.println("\n5. Test Duplicate Student ID");

        hashTable.insert(
                new Student("23DA2-030", "Another Student", "IT", 70.0)
        );

        System.out.println("\n6. Delete Student");

        hashTable.delete("23DA2-020");

        System.out.println("\nHash Table After Deletion");

        hashTable.displayTable();

        System.out.println("7. Delete Missing Student");

        hashTable.delete("23DA2-999");

        System.out.println("\n8. Check Hash Table");

        System.out.println("Is Hash Table Empty? " + hashTable.isEmpty());

        System.out.println("\n=================================");
        System.out.println(" Hashing Testing Completed");
        System.out.println("=================================");
    }
}