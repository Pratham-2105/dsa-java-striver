package Collections.Iterators;

import java.util.*;

public class List_Iterator {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        arr.add(12);
        arr.add(24);
        arr.add(15);
        arr.add(20);
        System.out.println(arr);

        /*
         * for (var num : arr) {
         * System.out.println(num);
         * }
         * System.out.println();
         */

        Iterator<Integer> it = arr.iterator();
        while (it.hasNext()) {
            Integer num = it.next();
            System.out.println(num);
        }
    }
}
