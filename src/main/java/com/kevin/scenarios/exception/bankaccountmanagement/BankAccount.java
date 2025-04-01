package com.kevin.scenarios.exception.bankaccountmanagement;


// Encapsulation
public class BankAccount {

    private double balance;
    private final String accountNumber;

    public BankAccount( String accountNumber,double balance) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $ " + amount);
        } else {
            System.out.println("Invalid Deposit amount");
        }
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds");
        } else {
            balance -= amount;
            System.out.println("Withdraw amount $ " + amount);
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance is $ " + balance);
    }
}
