package Patterns;

import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = scan.nextInt();
        scan.close();

        for (int i = 0; i <= 2 * num - 2; i++) {
            for (int j = 0; j <= 2 * num - 2; j++) {
                int top = i;
                int bottom = (2 * num - 2) - i;
                int left = j;
                int right = (2 * num - 2) - j;

                System.out.print(num - Math.min(Math.min(top, bottom), Math.min(left, right)));
            }
            System.out.println();
        }
    }
}
