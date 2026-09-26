import model.Student;
import stack.StudentStack;

public class StackMain {

    public static void main(String[] args) {

        StudentStack stack = new StudentStack();

        System.out.println("=================================");
        System.out.println(" STUDENT RECORD SYSTEM");
        System.out.println(" Stack Module - Member 2");
        System.out.println(" N.D.F. Hainiya - 23DA2-0600");
        System.out.println("=================================\n");

        // Push Students
        System.out.println("1. Push Students");

        stack.push(
                new Student("23DA2-101", "Ali", "Computer Science", 80.0)
        );

        stack.push(
                new Student("23DA2-102", "Aisha", "Information Technology", 85.5)
        );

        stack.push(
                new Student("23DA2-103", "Kamal", "Software Engineering", 72.0)
        );

        // Display
        System.out.println("\n2. Display Stack");
        stack.displayStack();

        // Peek
        System.out.println("3. Peek");
        Student topStudent = stack.peek();

        if (topStudent != null) {
            System.out.println("Top Student:");
            System.out.println(topStudent);
        }

        // Pop
        System.out.println("\n4. Pop Student");
        Student poppedStudent = stack.pop();

        if (poppedStudent != null) {
            System.out.println("Popped Student:");
            System.out.println(poppedStudent);
        }

        // Display after pop
        System.out.println("\n5. Stack After Pop");
        stack.displayStack();

        // Size
        System.out.println("6. Stack Size");
        System.out.println("Total Students in Stack: " + stack.size());

        // Empty check
        System.out.println("\n7. Check Stack");
        System.out.println("Is Stack Empty? " + stack.isEmpty());

        System.out.println("\n=================================");
        System.out.println(" Stack Testing Completed");
        System.out.println("=================================");
    }
}