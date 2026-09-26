import model.Student;
import queue.StudentQueue;

public class QueueMain {

    public static void main(String[] args) {

        StudentQueue queue = new StudentQueue();

        System.out.println("=================================");
        System.out.println(" STUDENT RECORD SYSTEM");
        System.out.println(" Queue Module - Member 2");
        System.out.println(" N.D.F. Hainiya - 23DA2-0600");
        System.out.println("=================================\n");

        // Enqueue Students
        System.out.println("1. Enqueue Students");

        queue.enqueue(
                new Student("23DA2-201", "Ahmed", "Computer Science", 78.0)
        );

        queue.enqueue(
                new Student("23DA2-202", "Fathima", "Information Technology", 88.5)
        );

        queue.enqueue(
                new Student("23DA2-203", "Mohamed", "Software Engineering", 75.0)
        );

        // Display Queue
        System.out.println("\n2. Display Queue");
        queue.displayQueue();

        // Peek
        System.out.println("3. Peek");

        Student frontStudent = queue.peek();

        if (frontStudent != null) {
            System.out.println("Front Student:");
            System.out.println(frontStudent);
        }

        // Dequeue
        System.out.println("\n4. Dequeue Student");

        Student dequeuedStudent = queue.dequeue();

        if (dequeuedStudent != null) {
            System.out.println("Dequeued Student:");
            System.out.println(dequeuedStudent);
        }

        // Display after dequeue
        System.out.println("\n5. Queue After Dequeue");
        queue.displayQueue();

        // Size
        System.out.println("6. Queue Size");
        System.out.println("Total Students in Queue: " + queue.size());

        // Empty check
        System.out.println("\n7. Check Queue");
        System.out.println("Is Queue Empty? " + queue.isEmpty());

        // Test another dequeue
        System.out.println("\n8. Dequeue Another Student");

        Student secondStudent = queue.dequeue();

        if (secondStudent != null) {
            System.out.println("Dequeued Student:");
            System.out.println(secondStudent);
        }

        // Final queue
        System.out.println("\n9. Final Queue");
        queue.displayQueue();

        System.out.println("=================================");
        System.out.println(" Queue Testing Completed");
        System.out.println("=================================");
    }
}