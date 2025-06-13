package BasicArrays;

public class reverse_Array {
    public void reverse(int[] arr, int n) {
        /*
         * int[] rev = new int[n];
         * 
         * for(int i = n - 1; i >= 0; i--) {
         * rev[n - 1 - i] = arr[i];
         * }
         * 
         * for(int i = 0; i < n; i++) {
         * arr[i] = rev[i];
         * }
         * 
         * return;
         */

        int p1 = 0, p2 = n - 1;

        while (p2 > p1) {
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }

        return;
    }
}
