package com.simple.atm;

public class SavingsAccount extends Account{

    private final float interestRate;

    public SavingsAccount(double bal, int pin, float interestRate) {
        super(bal, pin);
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return (this.getBalance() * interestRate)/12;
    }
}
