package Patterns;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = scan.nextInt();
        scan.close();

        int i;
        for (i = 1; i <= num; i++) {

            int j;
            for (j = num - i; j >= 1; j--) {
                System.out.print(" ");
            }
            int k;
            for (k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
        int f;
        for (f = 1; f <= num; f++) {
            int j;
            for (j = 0; j < f - 1; j++) {
                System.out.print(" ");
            }
            int k;
            for (k = 1; k <= (2 * num) - (2 * f) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
