package BasicHashing;

class Solution {
    public int mostFrequentElement(int[] nums) {
        int maxElement = 0;
        int maxFrequency = 0;
        int size = nums.length;
        boolean[] visited = new boolean[size];

        for (int i = 0; i < size; i++) {
            if (visited[i])
                continue;
            int frequency = 0;

            for (int j = i; j < size; j++) {
                if (nums[i] == nums[j]) {
                    frequency++;
                    visited[j] = true;
                }
            }

            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                maxElement = nums[i];
            } else if (frequency == maxFrequency) {
                maxElement = Math.min(maxElement, nums[i]);
            }
        }

        return maxElement;
    }
}

public class mostFrequent {

    public static void main(String[] args) {
        int[] nums = { 4, 4, 5, 5, 6 };

        /*
         * Creating an instance of
         * Solution class
         */
        Solution sol = new Solution();

        /*
         * Function call to get the
         * highest occurring element in array nums
         */
        int ans = sol.mostFrequentElement(nums);

        System.out.println("The highest occurring element in the array is: " + ans);
    }
}
