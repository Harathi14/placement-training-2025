package day14;
import java.util.*;
public class hiii4 {
    public static void main(String[] args) {
        player.put(18, "Kohil");
        player.put(7, "Dhoni");
        player.put(33, "Hardik");
        player.put(77, "Gill");
        player.put(1, "Rahul");

        jersey.putAll(player);

        player.remove(player.get(77));
        player.remove(player.getOrDefault(77,"Gill"));

        System.out.println(player);

    }
    
}
