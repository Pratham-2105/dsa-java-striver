package BasicMaths;

import java.util.Scanner;

public class reverseNum {

    public static Integer rev_num(int n) {
        int rev = 0;

        while (n != 0) {
            int last = n % 10;

            rev = (rev * 10) + last;
            n /= 10;
        }

        return rev;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        System.out.println(rev_num(num));

    }
}
