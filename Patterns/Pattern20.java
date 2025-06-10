package Patterns;

import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = scan.nextInt();
        scan.close();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * num - 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i < num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print("*");
            }
            for (int s = 1; s <= (2 * num) - (2 * num - 2 * i); s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= num - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
