package _8kyu.sum;

import one.util.streamex.IntStreamEx;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sum {

    //https://www.codewars.com/kata/5b73fe9fb3d9776fbf00009e/train/java

    //solution first
    public static int sumOfDifferences(int[] arr) {
        List<Integer> list = IntStream.of(arr).boxed().collect(Collectors.toList());
        return IntStreamEx.of(list).sorted(Comparator.reverseOrder()).pairMap((a, b) -> a - b).sum();

    }
}
