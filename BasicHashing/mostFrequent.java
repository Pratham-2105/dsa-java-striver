package BasicHashing;

import java.util.*;

class Solution {
    public int mostFrequentElement(int[] nums) {
        // *** BruteForce ***
        /*
         * int maxElement = 0;
         * int maxFrequency = 0;
         * int size = nums.length;
         * boolean[] visited = new boolean[size];
         * 
         * for (int i = 0; i < size; i++) {
         * if (visited[i])
         * continue;
         * int frequency = 0;
         * 
         * for (int j = i; j < size; j++) {
         * if (nums[i] == nums[j]) {
         * frequency++;
         * visited[j] = true;
         * }
         * }
         * 
         * if (frequency > maxFrequency) {
         * maxFrequency = frequency;
         * maxElement = nums[i];
         * } else if (frequency == maxFrequency) {
         * maxElement = Math.min(maxElement, nums[i]);
         * }
         * }
         * 
         * return maxElement;
         * 
         */

        // *** Optimal ***
        Arrays.sort(nums);
        int largestElement = nums[nums.length - 1];
        int[] hash = new int[largestElement + 1];

        int maxCount = 0;
        int element = -1;

        for (int i = 0; i < nums.length; i++) {
            hash[nums[i]]++;
        }

        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > maxCount) {
                maxCount = hash[i];
                element = i;
            }
        }

        return element;

    }
}

public class mostFrequent {

    public static void main(String[] args) {
        int[] nums = { 4, 4, 5, 5, 6 };

        Solution sol = new Solution();

        /*
         * Function call to get the
         * highest occurring element in array nums
         */
        int ans = sol.mostFrequentElement(nums);

        System.out.println("The highest occurring element in the array is: " + ans);
    }
}