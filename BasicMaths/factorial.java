package BasicMaths;

import java.util.Scanner;

public class facotorial {

    public static int fact(int n) {
        int ans = 1;

        for (int i = 1; i <= n; i++) {
            ans = ans * i;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        System.out.println(fact(num));
    }
}
