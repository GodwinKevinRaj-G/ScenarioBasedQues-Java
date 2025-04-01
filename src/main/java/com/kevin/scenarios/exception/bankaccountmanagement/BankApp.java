package com.kevin.scenarios.exception.bankaccountmanagement;

public class BankApp {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("1234566", 50000);
        bankAccount.displayBalance();
        System.out.println("-------");
        bankAccount.deposit(5000);
        bankAccount.displayBalance();
        System.out.println("-------");
        try {
            bankAccount.withdraw(60000);
        } catch (InsufficientFundsException exception) {
            System.out.println("Exception " + exception.getMessage());
        }
        bankAccount.displayBalance();
    }
}
