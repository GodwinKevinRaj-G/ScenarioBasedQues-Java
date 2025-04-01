package com.kevin.scenarios.exception.bankaccountmanagement;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
