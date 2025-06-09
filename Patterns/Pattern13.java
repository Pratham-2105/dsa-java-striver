package Patterns;

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 5;
        scan.close();

        int number = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number);
                number++;

                if (j != i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
