package Patterns;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = scan.nextInt();
        scan.close();

        for (int i = 1; i <= num; i++) {
            char start = 'A';
            // For SPACE;

            for (int j = num - i; j >= 1; j--) {
                System.out.print(" ");
            }
            // For Alphabets;

            for (int a = 1; a <= 2 * i - 1; a++) {
                System.out.print(start);
                if (a < i) {
                    start++;
                } else {
                    start--;
                }
            }

            System.out.println();
        }
    }
}
