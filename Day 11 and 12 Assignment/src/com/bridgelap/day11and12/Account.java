package com.bridgelap.day11and12;

public class Account {

    private double balance = 50.0;

    public Account(double balance) {
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void credit(double amount) {
        balance = balance + amount;
    }

    public void debit(double amount) {
        balance = balance - amount;
    }
}
