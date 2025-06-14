import java.util.Scanner;

public class in_out_Array {

    public static int[] inputArray(int arr[], int size, Scanner scan) {

        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();

        }
        System.out.println("Elements of the Array are: ");
        outputArray(arr, size);
        return arr;
    }

    public static void outputArray(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        inputArray(arr, size, scan);
        scan.close();

    }
}