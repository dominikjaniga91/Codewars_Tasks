package _6kyu.findodd;

import java.util.*;

public class FindOdd {

    // https://www.codewars.com/kata/54da5a58ea159efa38000836/train/java

    public static int findIt(int[] a) {

        Map<Integer, Integer> occurrence = new HashMap<>();
        Arrays.stream(a).forEach(number -> occurrence.merge(number, 1, Integer::sum));

        return occurrence.entrySet().stream()
                        .filter(k -> (k.getValue() % 2) != 0)
                        .map(Map.Entry::getKey)
                        .findFirst()
                        .orElseThrow();
    }

    /* another solution
        stream(arr).reduce(0, (x, y) -> x ^ y);

        XOR will cancel out everytime you XOR with the same number so
        1^1=0 but 1^1^1=1 so every pair should cancel out leaving the odd number out
     */
}
