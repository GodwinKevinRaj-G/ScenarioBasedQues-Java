package com.kevin.scenarios.exception.codingquestions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequentElement {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 3, 2, 3, 4, 1, 3);
        Optional<Map.Entry<Integer,Long>> key=integers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue());
        Long value = key.get().getValue();

        Map<Integer, Long> freqMap = integers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        List<String> collect = freqMap.entrySet()
                .stream().map(entry -> entry.getKey() + "-" + entry.getValue())
                .toList();

        System.out.println(value);
        System.out.println(collect);
    }
}
