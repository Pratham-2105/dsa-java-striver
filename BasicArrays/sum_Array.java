package BasicArrays;

import java.lang.reflect.Array;
import java.util.*;

public class sum_Array {

    public static int sum(int arr[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        System.out.println("Sum of array elements: " + sum(arr, n));
    }
}
