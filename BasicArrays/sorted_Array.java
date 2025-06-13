package BasicArrays;

public class sorted_Array {
    public static boolean arraySortedOrNot(int[] arr, int n) {

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1] && i < n) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;

        // Function call to check if the array is sorted
        boolean sorted = arraySortedOrNot(arr, n);

        if (sorted) {
            System.out.println("Array is sorted.");
        } else {
            System.out.println("Array is not sorted.");
        }
    }
}
