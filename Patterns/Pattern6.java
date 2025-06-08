package Patterns;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = scan.nextInt();
        scan.close();

        int i;
        for (i = 1; i <= num; i++) {
            int j;
            for (j = 1; j <= num - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}