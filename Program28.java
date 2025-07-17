abstract class BankAccount {
    abstract double calculateInterest(double balance);
}

class SavingAccount extends BankAccount {
    double calculateInterest(double balance) {
        return balance * 0.04;
    }

    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount();
        System.out.println("Interest: " + sa.calculateInterest(10000));
    }
}
