package _7kyu.maxDiff;

import static java.util.Arrays.*;

public class Solution {

    // https://www.codewars.com/kata/588a3c3ef0fbc9c8e1000095

    public static int maxDiff(int[] lst) {
        int max = stream(lst).max().orElse(0);
        int min = stream(lst).min().orElse(0);
        return max - min;
    }
}
