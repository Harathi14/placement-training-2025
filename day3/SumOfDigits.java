import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check for valid input
        if (number < 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int sum = 0;

        // Logic to calculate sum of digits
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            sum += digit;            // Add it to the sum
            number /= 10;            // Remove the last digit
        }

        // Output
        System.out.println("Sum of digits: " + sum);
    }
}

