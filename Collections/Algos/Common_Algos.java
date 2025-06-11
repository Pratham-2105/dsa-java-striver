package Collections.Iterators.Algos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Common_Algos {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        arr.add(12);
        arr.add(24);
        arr.add(15);
        arr.add(20);
        arr.add(45);
        arr.add(-24);
        arr.add(0);

        // (i) Sorted-

        Collections.sort(arr);
        System.out.println(arr);

        // (ii) Max/Min -

        System.out.println(Collections.max(arr));
        System.out.println(Collections.min(arr));

        // (iii) Reverse -

        Collections.reverse(arr);
        System.out.println(arr);

        // (iv) Exponent -

        double num = Math.pow(2, 5);
        System.out.println(num);
    }
}
