package Collections.Maps;

import java.util.*;

public class Tree_Map {
    public static void main(String[] args) {

        // Stores in sorted order;
        // Won't store Duplicate;

        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(10, "Pratham");
        tm.put(12, "Raghav");
        tm.put(17, "Aditya");
        System.out.println(tm);
        System.out.println(tm.ceilingKey(11));
        System.out.println(tm.floorKey(11));

        Set<Integer> st = tm.keySet();
        System.out.println(st);
    }
}
