import java.util.Scanner;

public class handcricket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("player :");
        int z = sc.nextInt();
        return ;
    }
    static int CPU(){
        int z = (int)(Math.random()*6)+1;
        return z;
    }
}
        
