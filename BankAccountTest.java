package com.practice.model;

import com.practice.exception.InsufficientFundsException;
import com.practice.exception.NegativeAmountException;

public class BankAccountTest {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(101, "Vivek", 1000);

        try {
            System.out.println("Initial account: " + account);
            
            account.deposit(500);
            account.withdraw(200);
            
            account.deposit(-100);

        } catch (NegativeAmountException | InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            account.withdraw(2000);
        } catch (NegativeAmountException | InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Final account: " + account);
    }
}
