package Patterns;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = scan.nextInt();
        scan.close();

        // This program is written by me;

        for (int i = 1; i <= num; i++) {
            // Loop for first NUMBER pyramid;
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Loop for inverted SPACE triangle;
            for (int s = 2 * num - (2 * i); s >= 1; s--) {
                System.out.print(" ");
            }

            // Loop for reverse NUMBER pyramid;
            for (int k = num - (num - i); k >= 1; k--) {
                System.out.print(k);
            }

            System.out.println();
        }

        // This is the program that is present in
        // in the Editorial.

        /*
         * class Solution {
         * // Function to print pattern12
         * void pattern12(int n) {
         * // Initial no. of spaces in row 1.
         * int spaces = 2 * (n - 1);
         * 
         * // Outer loop for the number of rows.
         * for (int i = 1; i <= n; i++) {
         * // For printing numbers in each row
         * for (int j = 1; j <= i; j++) {
         * System.out.print(j);
         * }
         * 
         * // For printing spaces in each row
         * for (int j = 1; j <= spaces; j++) {
         * System.out.print(" ");
         * }
         * 
         * // For printing numbers in each row
         * for (int j = i; j >= 1; j--) {
         * System.out.print(j);
         * }
         * 
         * /* As soon as the numbers for each iteration
         * are printed, we move to the next row and give
         * a line break otherwise all numbers would get
         * printed in 1 line
         * 
         * System.out.println();
         * 
         * /*
         * After each iteration nos. increase by
         * 2, thus spaces will decrement by 2
         * spaces -= 2;
         * }
         * }
         * 
         * public static void main(String[] args) {
         * int N = 5;
         * 
         * // Create an instance of Solution class
         * Solution sol = new Solution();
         * 
         * sol.pattern12(N);
         * }
         * }
         */

    }
}