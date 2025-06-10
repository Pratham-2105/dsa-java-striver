package Patterns;

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = scan.nextInt();
        scan.close();

        // UPPER-HALF

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i + 1; j++) {
                System.out.print("*");
            }
            for (int s = 1; s < 2 * i - 1; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= num - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        // LOWER-HALF

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int s = 1; s <= (2 * num) - 2 * i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
