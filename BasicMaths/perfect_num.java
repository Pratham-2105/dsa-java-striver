import java.util.*;

public class perfect_num {

    public static boolean perfectNum(int n) {
        int sum = 0;

        for (int i = 1; i < n / 2 + 1; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        System.out.print(perfectNum(num));

    }
}
