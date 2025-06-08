package Patterns;

public class Pattern1 {
    public static void main(String[] args) {
        int n = 4;
        int i;
        for (i = 0; i < n; i++) {
            int j;
            for (j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}