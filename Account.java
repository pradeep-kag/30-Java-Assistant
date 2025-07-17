public class Account {
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Account acc = new Account();
        acc.setBalance(1000.50);
        System.out.println("Balance: " + acc.getBalance());
    }
}
