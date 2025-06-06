public import java.util.Scanner;

public class reversenumber {
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

        // Logic to reverse the number
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;       // Extract last digit
            reversed = reversed * 10 + digit; // Append to reversed
            number /= 10;                  // Remove last digit
        }

        // Output
        System.out.println("Reversed number: " + reversed);
    }
}
 {
    
}
