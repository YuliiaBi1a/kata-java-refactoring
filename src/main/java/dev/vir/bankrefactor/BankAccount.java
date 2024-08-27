package dev.vir.bankrefactor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankAccount {
    private double balance;
    private List<String> transactions;

    public BankAccount() {
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add(new Date() + " - Deposit: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions.add(new Date() + " - Withdraw: " + amount);
        }
    }

    public double getBalance() {
        return balance;
    }

    public List<String> getTransactionHistory() {
        return transactions;
    }
}
