import java.util.Scanner;

public class isArmstrong {

    public static boolean Armstrong(int n) {
        int temp = n;
        int num = n;
        int value = (int) (Math.log10(n) + 1);

        int sum = 0;
        for (int i = 0; i < value; i++) {
            sum += Math.pow((temp % 10), value);
            temp /= 10;
        }

        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        System.out.println(Armstrong(num));
    }
}
