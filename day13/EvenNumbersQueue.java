import java.util.LinkedList;
import java.util.Queue;

public class EvenNumbersQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Adding even numbers to the queue
        for (int i = 2; i <= 10; i += 2) {
            queue.add(i);
        }

        // Printing and removing elements from the queue
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
