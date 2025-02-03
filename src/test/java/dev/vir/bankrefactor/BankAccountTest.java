package dev.vir.bankrefactor;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void testDeposit() {
        BankAccount account = new BankAccount();
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance());
    }

    @Test
    void testWithdraw() {
        BankAccount account = new BankAccount();
        account.deposit(100.0);
        account.withdraw(50.0);
        assertEquals(50.0, account.getBalance());
    }

    @Test
    void testWithdrawMoreThanBalance() {
        BankAccount account = new BankAccount();
        account.deposit(50.0);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.withdraw(100.0));
        assertEquals("Fondos insuficientes.", exception.getMessage());
    }

    @Test
    void testNegativeDeposit() {
        BankAccount account = new BankAccount();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.deposit(-10.0));
        assertEquals("El monto del depósito debe ser positivo.", exception.getMessage());
    }

    @Test
    void testNegativeWithdraw() {
        BankAccount account = new BankAccount();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.withdraw(-10.0));
        assertEquals("El monto del retiro debe ser positivo.", exception.getMessage());
    }

    @Test
    void testTransactionHistory() {
        BankAccount account = new BankAccount();
        account.deposit(100.0);
        account.withdraw(50.0);
        List<Transaction> history = account.getTransactionHistory();
        assertEquals(2, history.size());
        assertTrue(history.get(0).toString().contains("Deposit"));
        assertTrue(history.get(1).toString().contains("Withdraw"));
    }

}