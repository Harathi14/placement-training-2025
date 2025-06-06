import java.util.Scanner;

public class sumofnaturalnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Read an integer n
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        // Check for valid input
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            // Calculate the sum using the formula: sum = n * (n + 1) / 2
            int sum = n * (n + 1) / 2;

            // Output: Print the sum
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }

        scanner.close();
    }
}
