package BasicHashing;

import java.util.*;

class Solution {

}

public class second_most_frequent {
    public static int secondMostFrequentElement(int[] nums) {
        Arrays.sort(nums);

        int largestElement = nums[nums.length - 1];
        int size = nums.length;

        int maxElement = -1;
        int maxFrequency = 0;

        int SmaxElement = -1;
        int SmaxFrequency = 0;

        int[] hash = new int[largestElement + 1];

        for (int i = 0; i < size; i++) {
            hash[nums[i]]++;
        }

        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > maxFrequency) {
                maxElement = i;
                maxFrequency = hash[i];
            }
        }

        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > SmaxFrequency && hash[i] != maxFrequency) {
                SmaxElement = i;
                SmaxFrequency = hash[i];
            }
        }

        if (SmaxFrequency < maxFrequency && maxFrequency != 1)
            return SmaxElement;
        else
            return -1;

    }

    public static void outputArray(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = { 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000,
                5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000,
                5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000,
                5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000,
                5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000,
                5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000 };
        int ans = secondMostFrequentElement(arr);

        System.out.print(ans);
    }
}
