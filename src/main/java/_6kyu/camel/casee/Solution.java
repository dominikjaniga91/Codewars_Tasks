package _6kyu.camel.casee;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {

    // https://www.codewars.com/kata/587731fda577b3d1b0001196/java

    public static String camelCase(String str) {
        return Arrays.stream(str.split(" "))
                .map(Solution::toCamelCase)
                .collect(Collectors.joining());
    }

    private static String toCamelCase(String word) {
        return word.length() > 1 ? word.substring(0,1).toUpperCase() + word.substring(1)
                                    : word.toUpperCase();
    }


}
