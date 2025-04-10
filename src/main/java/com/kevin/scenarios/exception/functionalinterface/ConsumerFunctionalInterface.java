package com.kevin.scenarios.exception.functionalinterface;

import java.util.function.Consumer;

public class ConsumerFunctionalInterface {
    public static void main(String[] args) {
        /**
         * 1.Consumer
         */
        Consumer<String> consumer = message -> System.out.println(message);
        consumer.accept("Hi Kevin Welcome Back!");
    }
}
