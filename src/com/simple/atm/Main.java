package com.simple.atm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pinNum;
        int userOption;

          CheckingAccount account1 = new CheckingAccount(5000, 1423, 2);

        Scanner scanner = new Scanner(System.in);

        ATM atm = new ATM();

        pinNum = scanner.nextInt();

        if(account1.validatePin((pinNum))) {
            do {
                atm.menu();
                userOption = scanner.nextInt();
                switch (userOption) {
                    case 1:
                        atm.checkBalance(account1.getBalance());
                        //System.out.printf("\nYour monthly interest earned is $%.2f ", account1.calculateInterest());
                        break;
                    case  2:
                        atm.depositMenu();
                        double depAmnt = scanner.nextDouble();
                        account1.deposit(depAmnt);
                        break;
                    case 3:
                        atm.withdrawMenu();
                        double withdrawAmount = scanner.nextDouble();
                        account1.withdraw(withdrawAmount + account1.getFee());
                        break;

                    case 4:
                        atm.exitMenu();
                        break;

                    default:
                        atm.invalidMenu();

                }            } while (userOption != 4);

        }    }
}
