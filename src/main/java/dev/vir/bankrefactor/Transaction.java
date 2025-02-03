package dev.vir.bankrefactor;

import java.util.Date;

public class Transaction {
    private final Date date;
    private final String type;
    private final double amount;

    public Transaction(String type, double amount) {
        this.date = new Date();
        this.type = type;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return date + " - " + type + ": " + amount;
    }
}
