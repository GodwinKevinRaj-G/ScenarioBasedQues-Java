package com.kevin.scenarios.exception.functionalinterface;

import java.util.function.DoubleSupplier;

public class SupplierFunctionalInterface {
    public static void main(String[] args) {
        /**
         * Supplier
         */
        DoubleSupplier value = Math::random;
        Double randomValue = value.getAsDouble();
        System.out.println(randomValue);
    }
}
