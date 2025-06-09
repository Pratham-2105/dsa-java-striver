public class Exceptions {
    public static void main(String[] args) {
        try {
            int n1 = 12;
            int n2 = 0;
            int n3 = n1 / n2;
            System.out.println(n3);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
