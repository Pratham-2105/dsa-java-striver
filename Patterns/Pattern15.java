package Patterns;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = scan.nextInt();
        scan.close();

        for (int i = 1; i <= num; i++) {
            char start = 'A';
            for (int j = num; j >= i; j--) {
                System.out.print(start);
                start++;
            }
            System.out.println();
        }

    }
}
