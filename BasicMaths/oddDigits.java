package BasicMaths;

import java.util.Scanner;

public class oddDigits {

    public static Integer odd_Digits(int n) {
        Integer digits = 0;

        while (n != 0) {
            int rem = n % 10;

            if (rem % 2 == 1) {
                digits += 1;
                n /= 10;
            } else {
                n /= 10;
            }
        }

        return digits;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        System.out.println(odd_Digits(num));

    }
}
