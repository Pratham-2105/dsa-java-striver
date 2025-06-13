package BasicArrays;

public class odd_sum_Array {
    public static int countOdd(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                count += 1;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        // Creating an instance of Solution class
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;

        // Function call to count the odd numbers in an array
        int count = countOdd(arr, n);
        System.out.println("Count of odd numbers: " + count);
    }
}
