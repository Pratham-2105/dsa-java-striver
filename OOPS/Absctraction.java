package OOPS;

abstract class newAccount {
    // no object can be created;
    double balance;

    abstract void addMoney(double _amount);

    abstract void widthdrawMoney(double amount);

    void updateBalance(double _balance) {
        balance = _balance;
    }

    public double getBalance1() {
        return balance;
    }
}

class Savings extends newAccount {
    public void addMoney(double _amount) {
        super.updateBalance(super.getBalance1() + _amount);
    }

    public void widthdrawMoney(double amount) {
        if (amount <= super.getBalance1()) {
            System.out.println("The user can widthdraw money.");
        } else {
            System.out.println("The use cannot widthdraw money.");
        }
    }
}

class CurrentAcc extends newAccount {
    double minLimit = 1000.0;

    public void addMoney(double _amount) {
        super.updateBalance(super.getBalance1() + _amount);
    }

    public void widthdrawMoney(double amount) {
        if (super.getBalance1() - amount <= minLimit) {
            System.out.println("The user cannot widthdraw money.");
        } else {
            System.out.println("The user can widthdraw money.");
        }
    }
}

public class Absctraction {

}
