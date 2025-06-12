import java.util.Arrays;
import java.util.Scanner;

public class divisors {

    public static int[] divs(int n) {
        int arr[] = new int[n];
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arr[count++] = i;
            }
        }

        int[] out = Arrays.copyOf(arr, count);

        return out;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        divisors solve = new divisors();

        int[] ans = solve.divs(num);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

    }
}