package _8kyu.invert.values;

import java.util.Arrays;

public class Solution {
    public static int[] invert(int[] array) {
        return Arrays.stream(array)
                .map(i -> -i)
                .toArray();
    }
}
