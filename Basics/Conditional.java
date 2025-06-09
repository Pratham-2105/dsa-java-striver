import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the age of the subject: ");
        int age = scan.nextInt();
        scan.close();

        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Teen");
        }
    }
}
