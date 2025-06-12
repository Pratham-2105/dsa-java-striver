package BasicMaths;

import java.util.Scanner;

public class nPrimeNums {

    public static boolean is_prime(int n) {
        if (n < 2) {
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

    public static int prime(int n) {
        int count = 0;

        for (int i = 2; i < n; i++) {
            if (is_prime(i)) {
                count += 1;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        System.out.println(prime(num));
    }
}
