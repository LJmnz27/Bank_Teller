package Java_Bank_Pursuit_HW_JIMENEZ_LUIS;

public class BankAccount {
    private String accountNumber;
    private String type;
    private double balance;

    // Constructor

    public BankAccount(String accountNumber, String type, double balance) {
        this.accountNumber = accountNumber;
        this.type = type;
        this.balance = balance;
    }


    public double getBalance() {
        return balance;
    }

    // Methods
    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

}
