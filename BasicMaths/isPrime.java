import java.util.Scanner;

public class isPrime {
    public static boolean is_Prime(int n) {

        // Brute Force Solution;

        /*
         * if (n <= 2) {
         * return true;
         * } else {
         * for (int i = 2; i < n; i++) {
         * if (n % i == 0) {
         * return false;
         * }
         * }
         * }
         * return true;
         */

        // Optimal Solution;

        if (n <= 2) {
            return true;
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        System.out.print(is_Prime(num));
    }
}
