package _8kyu.sum;

import one.util.streamex.IntStreamEx;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sum {

    //https://www.codewars.com/kata/5b73fe9fb3d9776fbf00009e/train/java

    public static int sumOfDifferences(int[] arr) {
        Arrays.sort(arr);
        return arr.length <= 1 ? 0 : arr[arr.length-1] - arr[0];
    }

    //solution first
    public static int sumOfDifferencesWithStreamEx(int[] arr) {
        List<Integer> list = IntStream.of(arr).boxed().collect(Collectors.toList());
        return IntStreamEx.of(list).sorted(Comparator.reverseOrder()).pairMap((a, b) -> a - b).sum();

    }

    //solution third
    public static int sumOfDifferencesWithIntStream(int[] arr) {
        List<Integer> list = IntStream.of(arr).boxed()
                                .sorted(Comparator.reverseOrder())
                                .collect(Collectors.toList());

        return IntStream.range(1, list.size()).map(i -> list.get(i - 1)  - list.get(i)).sum();
    }

}
