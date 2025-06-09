package Patterns;

import java.util.Scanner;

public class Pattern16 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        char start = 'A';

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(start);
            }
            start++;
            System.out.println();
        }
    }
}
