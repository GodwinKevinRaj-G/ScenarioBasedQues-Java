package com.kevin.scenarios.exception.codingquestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class SortData {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 3, 5, 6, 8, 10, 90, 1, 100);
        List<Integer> values = integers.stream().sorted().toList();
        System.out.println(values);
        System.out.println(values.get(4));

        List<Integer> distinct = values.stream().distinct().toList();
        System.out.println(distinct);

        Optional<Integer> finalValue =distinct.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(finalValue.get());

        System.out.println();
    }
}
