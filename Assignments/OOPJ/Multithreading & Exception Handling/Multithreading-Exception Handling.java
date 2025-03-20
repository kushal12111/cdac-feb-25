class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited " + amount + ". Current Balance: " + balance);
    }

    public synchronized void withdraw(int amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal. Requested: " + amount + ", Available: " + balance);
        }
        balance -= amount;
        System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ". Current Balance: " + balance);
    }
}

class Customer implements Runnable {
    private BankAccount account;
    private boolean deposit;
    private int amount;

    public Customer(BankAccount account, boolean deposit, int amount) {
        this.account = account;
        this.deposit = deposit;
        this.amount = amount;
    }

    @Override
    public void run() {
        try {
            if (deposit) {
                account.deposit(amount);
            } else {
                account.withdraw(amount);
            }
        } catch (InsufficientFundsException e) {
            System.out.println(Thread.currentThread().getName() + " failed to withdraw " + amount + ": " + e.getMessage());
        }
    }
}

public class BankApplication {
    public static void main(String[] args) {
        BankAccount sharedAccount = new BankAccount(1000);

        Thread customer1 = new Thread(new Customer(sharedAccount, true, 500), "Customer-1");
        Thread customer2 = new Thread(new Customer(sharedAccount, false, 700), "Customer-2");
        Thread customer3 = new Thread(new Customer(sharedAccount, false, 1500), "Customer-3");
        Thread customer4 = new Thread(new Customer(sharedAccount, true, 200), "Customer-4");

        customer1.start();
        customer2.start();
        customer3.start();
        customer4.start();
    }
}
