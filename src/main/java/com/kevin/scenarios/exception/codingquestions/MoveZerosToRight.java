package com.kevin.scenarios.exception.codingquestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MoveZerosToRight {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(-1, 3, -5, 2, -8, 0, 3, 18, 0, -19, 0, 11, 0);
        integers.sort(Integer::compareTo);
        System.out.println(integers);
        List<Integer> moveZerozToRight = Stream.concat(integers.stream().filter(integer -> integer != 0), integers.stream().filter(integer -> integer == 0)).toList();
        System.out.println(moveZerozToRight);
    }
}
