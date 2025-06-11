package Collections.CustomOperators;

import java.util.*;

public class file1 {

    public static Comparator<Integer> getComparator() {
        // Basically overode the default class and
        // changed it to sort in descending order;
        return new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                if (num2 > num1) {
                    return 1;
                } else if (num1 > num2) {
                    return -1;
                }
                return 0;
            }
        };
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(16);
        arr.add(21);
        arr.add(12);

        Collections.sort(arr);
        System.out.println(arr);

        Collections.sort(arr, getComparator());
        System.out.println(arr);

    }
}
