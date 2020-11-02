package _7kyu.singles.array;

import java.util.*;

public class Solution {
    public static int repeats(int[] arr) {
        List<Integer> numbers = new ArrayList<>();

        for (int number : arr) {
            if (numbers.contains(number)) {
                numbers.remove(Integer.valueOf(number));
            } else {
                numbers.add(number);
            }
        }
        return numbers.stream().reduce(0, Integer::sum);
    }
}