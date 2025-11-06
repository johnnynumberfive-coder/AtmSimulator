package com.simple.atm;

public class ATM {
    public  ATM() {
        System.out.print("Welcome! Please enter your pin: ");
    }

    public void menu() {
        System.out.println("\n\n1.  Check Balance");
        System.out.println("\n2.  Deposit");
        System.out.println("\n3.  Withdraw");
        System.out.println("\n4.  Exit");
    }

    public void checkBalance(double balance) { System.out.printf("Your balance is $%.2f ", balance);}
    public void depositMenu() { System.out.println("Please enter amount to deposit.");}
    public void withdrawMenu() { System.out.println("Please enter amount to withdraw.");}
    public void invalidMenu() { System.out.println("Invalid option.  Please try again.");}
    public void exitMenu() { System.out.println("THank you for banking with us! Have a nice day.");}
}
