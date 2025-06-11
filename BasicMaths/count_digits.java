package BasicMaths;

import java.util.*;

public class count_digits {

    public static Integer digits(int num) {
        int value = 0;
        if (num / 10 == 0) {
            return 1;
        } else {
            while (num != 0) {
                num /= 10;
                value += 1;
            }
        }
        return value;
    }

    public static void main(String[] args) {
        // My solution;

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        System.out.println(digits(num));
    }
}