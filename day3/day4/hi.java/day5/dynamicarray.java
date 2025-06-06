import java.util.ArrayList;

public class dynamicarray {
    public static void main(String[] args) {
        // Create a dynamic array of integers
        ArrayList<Integer> dynamicArray = new ArrayList<>();

        // Add elements to the dynamic array
        dynamicArray.add(10);
        dynamicArray.add(20);
        dynamicArray.add(30);

        // Display the dynamic array and its size
        System.out.println("Dynamic Array: " + dynamicArray); // Output: [10, 20, 30]
        System.out.println("Size: " + dynamicArray.size());   // Output: 3

        // Add more elements
        dynamicArray.add(40);
        dynamicArray.add(50);
        System.out.println("After Adding More Elements: " + dynamicArray); // Output: [10, 20, 30, 40, 50]

        // Remove an element at index 2
        dynamicArray.remove(2); // Removes the element 30
        System.out.println("After Removal: " + dynamicArray); // Output: [10, 20, 40, 50]

        // Access an element at index 1
        int element = dynamicArray.get(1);
        System.out.println("Element at Index 1: " + element); // Output: 20
    }
}

