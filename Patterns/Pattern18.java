package Patterns;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = scan.nextInt();
        scan.close();

        for (int i = 1; i <= num; i++) {
            char start = 'E';
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    start -= i - 1;
                }
                System.out.print(start);
                start++;
            }
            System.out.println();
        }
    }
}
