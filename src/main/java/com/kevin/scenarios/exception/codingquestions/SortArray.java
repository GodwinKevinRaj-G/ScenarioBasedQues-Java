package com.kevin.scenarios.exception.codingquestions;

import java.util.Arrays;
import java.util.List;

public class SortArray {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(11, 2, 1, 4, 5, 7, 8, 100, 888);
        integers.sort(Integer::compareTo);
        System.out.println(integers);

        List<Integer> sorted = integers.stream().sorted().toList();
        System.out.println(sorted);

    }
}
