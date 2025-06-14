package BasicHashing;

import java.util.Arrays;

public class sum_of_low_and_high {
    public static int secondMostFrequentElement(int[] nums) {
        Arrays.sort(nums);

        int largestElement = nums[nums.length - 1];
        int size = nums.length;

        int maxElement = -1;
        int maxFrequency = 0;

        int minElement = 1000000;
        int minFrequency = Integer.MAX_VALUE;

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
            if (hash[i] != 0 && hash[i] < minFrequency) {
                minElement = i;
                minFrequency = hash[i];
            }
        }
        System.out.println(minFrequency + " " + maxFrequency);
        outputArray(hash, hash.length);
        return maxFrequency + minFrequency;

    }

    public static void outputArray(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = { 4, 4, 5, 5, 6 };
        System.out.print("SUM = " + secondMostFrequentElement(nums));
    }
}
