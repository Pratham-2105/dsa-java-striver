package BasicMaths;

import java.util.Scanner;

public class lcm {

    public static int LCM(int n1, int n2) {

        int maxNum = Math.max(n1, n2);
        int i = 1;
        int multiple = 0;

        do {
            multiple = i * maxNum;
            if (multiple % n1 == 0 && multiple % n2 == 0) {
                return multiple;
            } else {
                i += 1;
            }
        } while (i >= 1);

        return multiple;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        scan.close();

        System.out.println(LCM(num1, num2));
    }
}
