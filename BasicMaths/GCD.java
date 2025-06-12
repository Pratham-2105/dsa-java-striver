package BasicMaths;

import java.util.*;

public class GCD {

    public static int get_GCD(int num1, int num2) {

        // Brute Force; but a little optimized;

        int i;
        for (i = Math.min(num1, num2); i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                return i;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        scan.close();

        System.out.println(get_GCD(num1, num2));

    }
}
