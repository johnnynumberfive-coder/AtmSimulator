package com.simple.atm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pinNum;
        int userOption = 0;

        //  Account account1 = new Account(5000, 1423);

        Scanner scanner = new Scanner(System.in);

        ATM atm = new ATM();

        pinNum = scanner.nextInt();

      //  if(account1.validatePin((pinNum))) {
            do {
                atm.menu();
                userOption = scanner.nextInt();
                switch (userOption) {
                    case 1:
                      //  atm.checkBalance(account1.getBalance());
                        break;
                    case  2:
                        atm.depositMenu();
                        double depAmnt = scanner.nextDouble();
                     //   account1.deposit(depAmnt);
                        break;
                    case 3:
                        atm.withdrawMenu();
                        double withdrawAmount = scanner.nextDouble();
                    //    account1.withdraw(withdrawAmount);
                        break;

                    case 4:
                        atm.exitMenu();
                        break;

                    default:
                        atm.invalidMenu();

                }            } while (userOption != 4);

        }    }
//}
