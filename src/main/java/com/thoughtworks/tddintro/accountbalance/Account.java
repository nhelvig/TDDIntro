package com.thoughtworks.tddintro.accountbalance;

/**
 * Created by nhelvig on 9/1/15.
 */
public class Account {
    private int balance;

    public Account(int initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public int getBalance() {
        return this.balance;
    }

    public void withdraw(int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        }
    }
}
