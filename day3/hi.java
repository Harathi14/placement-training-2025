public class hi {
public static void main(string[] args) {
    scaanner sc = new scanner(system.in);
    int temp = 0;

    for(int i = 0;i<3;i++){
        int z = sc.nextInt();
        if(temp<z){
            temp = z;
        }
    }
    system.out.println(temp);
}    

    

