package streamsapiquestion;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateNumbers {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 23, 2, 2, 4, 5, 5, 6, 7, 8, 8, 9, 10, 11, 12, 12, 14, 16);
        List<Integer> duplicateValues = integers.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(integerLongEntry -> integerLongEntry.getValue() > 1).map(Map.Entry::getKey)
                .toList();
        System.out.println(duplicateValues);
    }
}
