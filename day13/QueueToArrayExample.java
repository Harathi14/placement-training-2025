import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;

public class QueueToArrayExample {
    public static void main(String[] args) {
        // Create a queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.add("a");
        queue.add("b");
        queue.add("c");
        queue.add("d");

        // Convert queue to an array
        String[] array = queue.toArray(new String[0]);

        // Display the array
        System.out.println("Array: " + Arrays.toString(array));
    }
}

