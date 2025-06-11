package Collections.Maps;

import java.util.*;

public class Hash_Map {
    public static void main(String[] args) {
        // key,value pairs
        // does not store keys in sorted order; (ORDER DOESN'T MATTER);

        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Pratham");
        hm.put(2, "Raghav");
        hm.put(3, "Aditya");
        System.out.println(hm);
        System.out.println(hm.get(2));
        System.out.println(hm.size());
        hm.remove(3);
        System.out.println(hm);
        System.out.println(hm.get(4));

    }
}
