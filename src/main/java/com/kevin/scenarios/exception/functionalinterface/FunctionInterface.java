package com.kevin.scenarios.exception.functionalinterface;

import java.util.function.Function;

public class FunctionInterface {
    public static void main(String[] args) {
        /**
         * 3.Function
         */

        Function<Integer, String> integerStringFunction = integer -> " Number: " + integer;
        String apply = integerStringFunction.apply(43);
        System.out.println(apply);
    }
}
