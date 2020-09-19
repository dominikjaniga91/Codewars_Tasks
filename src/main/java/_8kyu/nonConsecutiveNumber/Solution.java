package _8kyu.nonConsecutiveNumber;

import static java.util.stream.IntStream.*;

public class Solution {

    // https://www.codewars.com/kata/58f8a3a27a5c28d92e000144/train/java

    static int find(final int[] array) {
        return range(1, array.length)
                .filter(i -> array[i - 1] != array[i] - 1)
                .map(x -> array[x])
                .findFirst()
                .orElse(-1);
    }
}
