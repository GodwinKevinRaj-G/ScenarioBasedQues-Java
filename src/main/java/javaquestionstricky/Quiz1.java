package javaquestionstricky;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Quiz1 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 23, 44, 5, 67, 87);
        List<Integer> list = integers.stream().map(integer -> {
            if (integer == 1) return null;
            return integer * 2;
        }).toList();
        System.out.println(list);
    }


    //a.) Null pointer exception
    //b.) null,46, 88, 10, 134, 174
}
