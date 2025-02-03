package dev.vir.bankrefactor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankAccount {

    private double balance;
    private final List<Transaction> transactions;

    public BankAccount() {
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("El monto del depósito debe ser positivo.");
        }
        balance += amount;
        transactions.add(new Transaction("Deposit", amount));
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("El monto del retiro debe ser positivo.");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Fondos insuficientes.");
        }
        balance -= amount;
        transactions.add(new Transaction("Withdraw", amount));
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactionHistory() {
        return new ArrayList<>(transactions);
    }
}

