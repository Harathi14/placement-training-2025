public class perfectsquare {

    public static void main(String[] args) {
        int num = 25;
        int i = 1;
        while (i * i <= num) {
            if (i * i == num) {
                System.out.println(num + " is a perfect square");
                return;
            }
            i++;
        }
        System.out.println(num + " is not a perfect square");
    }
}