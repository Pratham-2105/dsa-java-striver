package OOPS;

class BankAccount {
    private double balance;
    private String accType;

    public BankAccount(double balance) { // Constructor
        this.balance = balance; // Current Object;
        this.accType = "Savings"; // Current Object;
    }

    public BankAccount(double _balance, String _accType) { // Constructor
        balance = _balance;
        accType = _accType;

    }

    public void setBalance(double Balance) {
        this.balance = Balance;
    }

    public double getBalance() {
        return balance;
    }

    public void printBalance() {
        System.out.println("The balance is: " + balance);
    }

    public void printAccType() {
        System.out.println("The type of account is: " + accType);
    }
}

/*
 * class Construct {
 * public Construct() { // Constructor;
 * System.out.println("Test Constructor Called");
 * }
 * 
 * public void printHello() {
 * System.out.println("Hello");
 * }
 * }
 */
public class Constructors {
    public static void main(String[] args) {

        /*
         * Construct test = new Construct();
         * test.printHello();
         */

        BankAccount newAcc = new BankAccount(12.45);
        newAcc.setBalance(1415);
        System.out.println(newAcc.getBalance());
    }
}