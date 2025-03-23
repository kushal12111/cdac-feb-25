import java.util.concurrent.atomic.AtomicInteger;

abstract class AccountOperations {
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    abstract void displayBalance();
}

class BankAccount extends AccountOperations {
    private static AtomicInteger totalAccounts = new AtomicInteger(0);
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount() {
        this.accountNumber = generateAccountNumber();
        this.accountHolderName = "Default Name";
        this.balance = 0.0;
        totalAccounts.incrementAndGet();
    }

    public BankAccount(String accountHolderName, double initialDeposit) {
        this.accountNumber = generateAccountNumber();
        this.accountHolderName = accountHolderName;
        this.balance = initialDeposit;
        totalAccounts.incrementAndGet();
    }

    public BankAccount(BankAccount existingAccount) {
        this.accountNumber = generateAccountNumber();
        this.accountHolderName = existingAccount.accountHolderName;
        this.balance = existingAccount.balance;
        totalAccounts.incrementAndGet();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    private String generateAccountNumber() {
        return "BA" + System.nanoTime();
    }

    @Override
    void deposit(double amount) {
        balance += amount;
    }

    @Override
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }

    void withdraw(double amount, String passcode) {
        if (balance >= amount && passcode.equals("secure123")) {
            balance -= amount;
        }
    }

    @Override
    void displayBalance() {
        System.out.println("Balance: " + balance);
    }

    public static int getTotalAccounts() {
        return totalAccounts.get();
    }

    public static void displayTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts.get());
    }
}

class SavingsAccount extends BankAccount {
    private static final double MIN_BALANCE = 500.0;

    @Override
    void withdraw(double amount) {
        if (getBalance() - amount >= MIN_BALANCE) {
            super.withdraw(amount);
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.deposit(1000);
        account1.withdraw(500);
        account1.displayBalance();

        BankAccount account2 = new BankAccount("Alice", 2000);
        account2.withdraw(300);
        account2.withdraw(200, "secure123");
        account2.displayBalance();

        BankAccount.displayTotalAccounts();

        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.deposit(1000);
        savingsAccount.withdraw(400);
        savingsAccount.displayBalance();
    }
}