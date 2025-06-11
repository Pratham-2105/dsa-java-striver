package Collections;

import java.util.*;

public class Sets {
    public static void main(String[] args) {
        // *** (i) HashSet

        // Collection of unique elements;
        // unordered;

        HashSet<Integer> hs = new HashSet<>();
        hs.add(12);
        hs.add(11);
        hs.add(11);
        System.out.println(hs);
        System.out.println(hs.contains(11));
        hs.remove(12);
        hs.add(15);
        hs.add(24);

        // Another-way to print a Set;

        for (var num : hs) {
            System.out.println(num);
        }

        System.out.println();

        // *** (ii) TreeSet;
        // Stores unique elements in sorted order;

        TreeSet<Integer> TS = new TreeSet<>();
        TS.add(24);
        TS.add(12);
        TS.add(40);
        TS.add(1223);
        TS.add(11);
        System.out.println(TS);
        TS.remove(1223);
        // System.out.println(TS);

        System.out.println(TS.floor(20)); // the first value <= 20
        System.out.println(TS.ceiling(11)); // the first value >= 11

    }
}
