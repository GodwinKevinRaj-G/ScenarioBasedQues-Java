package com.kevin.scenarios.exception.functionalinterface;

import java.util.function.Predicate;

public class PredicateFunctionInterface {
    public static void main(String[] args) {
        Predicate<String> results = str -> str == null || str.isEmpty();
        System.out.println("Is empty or null (''): " + results.test(""));
        System.out.println("Is empty or null ('kevin'): " + results.test("kevin"));
        System.out.println("Is empty or null ('123'): " + results.test("123"));
    }
}
