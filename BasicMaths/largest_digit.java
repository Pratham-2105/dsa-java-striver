package BasicMaths;

import java.util.Scanner;

public class largest_digit {

    public static int largestDigit(int n) {
        int largest = 0;
        // %10 and then compare...
        while (n != 0) {

            if (n % 10 > largest) {
                largest = n % 10;
                n /= 10;
            }

            n /= 10;
        }

        return largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        System.out.println(largestDigit(num));
    }
}
