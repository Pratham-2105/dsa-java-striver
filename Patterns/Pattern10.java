package Patterns;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        int i;
        for (i = 1; i <= num; i++) {
            int j;
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int p = 1; p < num; p++) {
            for (int q = num - 1; q >= p; q--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
