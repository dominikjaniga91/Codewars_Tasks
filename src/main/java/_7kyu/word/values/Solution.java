package _7kyu.word.values;

import java.util.stream.IntStream;

public class Solution {

    // https://www.codewars.com/kata/598d91785d4ce3ec4f000018

    public static int[] nameValue(String[] arr) {
        return IntStream.range(0, arr.length)
                .map(i -> getValueOfWord(arr[i]) * (i + 1))
                .toArray();
    }

    private static int getValueOfWord(String word) {
        return word.chars().filter(c -> c != ' ')
                        .map(c -> c - 96)
                        .sum();
    }
}
