package modifiers.session;

public class BankAccount {
    private String  accountNumber;
    private double balance;

    public BankAccount (String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit (double amount ) {
        balance += amount;
    }

    public void withdraw (double amount ) {
        balance -= amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
