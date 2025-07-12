package com.practice.model;

import com.practice.exception.InsufficientFundsException;
import com.practice.exception.NegativeAmountException;

public class BankAccount {
    private int id;
    private String name;
    private double balance;

    public BankAccount(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) throws NegativeAmountException {
        if (amount <= 0) {
            throw new NegativeAmountException("Amount to deposit should be greater than zero.");
        }
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    public void withdraw(double amount) throws InsufficientFundsException, NegativeAmountException {
        if (amount <= 0) {
            throw new NegativeAmountException("Amount to withdraw should be greater than zero.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Current balance: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }

    @Override
    public String toString() {
        return "BankAccount [id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }
}
