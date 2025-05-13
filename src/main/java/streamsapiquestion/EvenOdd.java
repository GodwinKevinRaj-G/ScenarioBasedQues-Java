package streamsapiquestion;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOdd {
    public static void main(String[] args) {

        /**
         * Odd & Even using streams API
         */
        List<Integer> integers = Arrays.asList(1, 2, 3, 5, 6, 7, 8, 9, 11, 15);
        Map<Boolean, Integer> collect = integers.stream().collect(Collectors.partitioningBy(integer -> integer % 2 == 0, Collectors.summingInt(Integer::intValue)));
        System.out.println(" evenSum : " + collect.get(true));
        System.out.println(" oddSum : " + collect.get(false));
    }
}
