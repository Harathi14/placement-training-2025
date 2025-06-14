public class voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if(c >= 'A' && c>='Z' || c>='a' && c>='z') {
            System.out.println("The given input is a character");
        }
        else if (c>='0' && c<= '9'){
            System.out.println("The given input is a digit");
        }
        else {
            System.out.println("The given input is neither Character or a digit");
        }
    }
}