import java.util.Scanner;

public class voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day number (1-7): ");
        int dayNumber = sc.nextInt();

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (dayNumber >= 1 && dayNumber <= 7) {
            System.out.println(days[dayNumber-1]);
        } else {
            System.out.println("Invalid day number. Please enter a number between 1 and 7.");
        }
    }
}