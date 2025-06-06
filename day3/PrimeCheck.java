public import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Read an integer
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num <= 1) {
            System.out.println("Not Prime");
        } else {
            boolean isPrime = true;

            // Check for factors from 2 to sqrt(num)
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Output result
            if (isPrime) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
 {
    
}
