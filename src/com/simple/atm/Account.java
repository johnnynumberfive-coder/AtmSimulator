package com.simple.atm;

public class Account implements Transactions{
    private final int accountNUmber;
    private int pin;
    private double balance;

    //feature to auto increment account number
    private static int nextAccountNumber = 1001;

    public Account(double bal, int pin) {
        this.balance = bal;
        this.pin = pin;
        
        accountNUmber = getNextAccountNumber();
    }

    public boolean validatePin(int p) {
        if(this.pin == p) {
            return true;
        }else {
            System.out.println("Invalid pin");
            return false;
        }
    }

    public int getNextAccountNumber() {
        int accNum = Account.nextAccountNumber;
        Account.nextAccountNumber++;
        return accNum;
    }

    @Override
    public boolean withdraw(double debitAmt) {
        if(debitAmt > balance) {
            System.out.println("Insufficient funds!");
            return false;
        } else {
            balance -= debitAmt;
            System.out.println("Successfully withdrew " + debitAmt);
            return true;
        }
    }

    @Override
    public boolean deposit(double creditAmt) {
        balance += creditAmt;
        System.out.println("Successfully deposited " + creditAmt);
        return true;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
