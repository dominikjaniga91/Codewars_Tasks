package _8kyu.stringRepeat;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

    // https://www.codewars.com/kata/57a0e5c372292dd76d000d7e/train/java

    // solution 1
    public static String repeatStr(final int repeat, final String string) {
        return string.repeat(repeat);
    }

    // solution 2

    public static String repeatStr2(final int repeat, final String string) {
        return IntStream.rangeClosed(0, repeat)
                .mapToObj(n -> string)
                .collect(Collectors.joining());
    }

    // solution 3

    public static String repeatStr3(final int repeat, final String string) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < repeat; i++)
            sb.append(string);
        return sb.toString();
    }

}
