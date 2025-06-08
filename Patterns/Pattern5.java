package Patterns;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = scan.nextInt();
        scan.close();

        int i;
        for (i = 1; i <= num; i++) {
            int j;
            for (j = num - i + 1; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}