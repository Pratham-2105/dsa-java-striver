import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        int[] arr = { 12, 44, 54, 45, 13 };

        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // FOR-EACH LOOP;

        for (int num : arr) {
            System.out.print(num + " ");
        }

        // WHILE LOOP;

        int j = 2;

        while (j <= 50) {
            System.out.println(j);
            j += 2;
        }

        // DO-WHILE LOOP;

        do {
            int num = scanner.nextInt();
            if (num == 10) {
                break;
            }
            System.out.println(num);
        } while (true);
        scanner.close();

    }

}
