package week04.threads;

public class BankAccount {
    private int balance = 1000;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposit: " + amount + " | New Balance: " + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public int getBalance() {
        return balance;
    }
}

