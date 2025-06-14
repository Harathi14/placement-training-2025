import java.util.Scanner;

public class PalindromeChe {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine().toLowerCase();
        String rev = new StringBuilder(s).reverse().toString();
        System.out.println(s.equals(rev) ? "Palindrome" : "Not a palindrome");
    }
}

