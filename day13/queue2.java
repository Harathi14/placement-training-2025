import java.util.Queue;
import java.util.LinkedList;

public class queue {
    public static void main(String[] args) {
        // Create a queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the queue (each added twice)
        queue.add("a"); queue.add("a");
        queue.add("b"); queue.add("b");
        queue.add("c"); queue.add("c");
        queue.add("d"); queue.add("d");
        queue.add(null); // Adding null value

        // Display the queue
        System.out.println("Queue: " + queue);

        // Remove elements one by one and display them
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
    }
}

