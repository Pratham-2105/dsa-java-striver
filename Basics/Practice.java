import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        // Given an integer, print adult if >= 18 else teen;

        Scanner scan = new Scanner(System.in);

        /*
         * String adult = "Adult";
         * String teen = "Teen";
         * 
         * System.out.println("Enter the age of the subject: ");
         * int age = scan.nextInt();
         * scan.close();
         * 
         * String out = age >= 18 ? adult : teen;
         * System.out.println(out);
         */

        // Make the grading chart; //Use else if;

        /*
         * System.out.print("Enter the marks of the student: ");
         * int marks = scan.nextInt();
         * scan.close();
         * 
         * if (marks >= 90) {
         * System.out.println("Grade: A");
         * } else {
         * if (marks >= 70) {
         * System.out.println("Grade: B");
         * } else {
         * if (marks >= 50) {
         * System.out.println("Grade: C");
         * } else {
         * if (marks >= 35) {
         * System.out.println("Grade: D");
         * } else {
         * System.out.println("Fail");
         * }
         * }
         * }
         * }
         */

        // A,B,C are three integers, check for the largest and also
        // check if two are same and are also the largest;

        /*
         * int n1 = scan.nextInt();
         * int n2 = scan.nextInt();
         * int n3 = scan.nextInt();
         * scan.close();
         * 
         * if (n1 > n2) {
         * // either n1 or n3 is greatest;
         * if (n1 > n3) {
         * System.out.println("Num1 is greatest: " + n1);
         * } else if (n3 > n1) {
         * System.out.println("Num3 is greatest: " + n3);
         * }
         * 
         * } else if (n2 > n1) {
         * // n2 is greatest or n3 is greatest;
         * if (n2 > n3) {
         * System.out.println("Num2 is the greatest:" + n2);
         * } else if (n3 > n2) {
         * System.out.println("Num3 is the greatest: " + n3);
         * }
         * 
         * } else {
         * System.out.println("Num3 is the greatest: " + n3);
         * }
         */

        // *** TABLE OF 2 TILL 50;
        /*
         * int i;
         * for (i = 2; i <= 50; i = i + 2) {
         * System.out.println(i);
         * }
         */

        // Given the total numbers and then the numbers
        // print the sum of these numbers;
        System.out.print("Enter the total numbers: ");
        int size = scan.nextInt();

        int[] arr = new int[size];

        int i;
        for (i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
            scan.close();
        }
        int sum = 0;
        int j;
        for (j = 0; j < size; j++) {
            sum += arr[j];
        }
        System.out.println("The sum of the numbers is: " + sum);
        scan.close();

    }
}
