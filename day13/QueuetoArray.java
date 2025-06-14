package day13;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;

public class QueuetoArray {
    public static void main(String[] args) {
        
        Queue<String> queue = new LinkedList<>();

        
        queue.add("a");
        queue.add("b");
        queue.add("c");
        queue.add("d");

        
        String[] array = queue.toArray(new String[0]);

        
        System.out.println("Array: " + Arrays.toString(array));
    }
}


