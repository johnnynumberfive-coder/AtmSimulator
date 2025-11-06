package com.simple.atm;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account(5000.00, 1456);
        System.out.println(account1.getBalance());
        account1.deposit(1000);
        System.out.println((account1.getBalance()));
        account1.withdraw(10000);
        account1.withdraw(1000);
        System.out.println(account1.getBalance());
    }
}
