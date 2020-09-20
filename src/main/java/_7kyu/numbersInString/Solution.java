package _7kyu.numbersInString;

import java.util.Arrays;

public class Solution {

    // https://www.codewars.com/kata/59dd2c38f703c4ae5e000014

    public static int solve(String s){
        var digits = s.replaceAll("[a-z]+", " ").trim();
        return Arrays.stream(digits.split(" "))
                .map(Integer::parseInt)
                .reduce(0, Integer::max);
    }

}
