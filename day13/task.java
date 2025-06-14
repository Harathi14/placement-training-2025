import java.util.LinkedList;
import java.util.Iterator;
import java.util.Queue;

public class task{  // Renamed the class to avoid conflict
    public static void main(String[] args) {
        
        Queue<String> queue = new LinkedList<>String>();

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