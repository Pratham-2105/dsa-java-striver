package BasicMaths;

import java.util.Scanner;

public class isPalindrome {

    public static boolean is_Palindrome(int n) {
        int temp = n;
        int rev = 0;

        while (temp != 0) {
            int last = temp % 10;

            rev = (rev * 10) + last;
            temp /= 10;
        }

        if (rev != n) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        System.out.println(is_Palindrome(num));
    }
}
