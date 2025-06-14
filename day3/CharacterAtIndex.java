import java.util.Scanner;

public class CharacterAtIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = "Java Exercises!";
        int index = scanner.nextInt();  // Read the index

        if (index >= 0 && index < str.length()) {
            System.out.println(str.charAt(index));  // Output the character only
        } else {
            System.out.println("Invalid index");
        }

        scanner.close();
    }
}