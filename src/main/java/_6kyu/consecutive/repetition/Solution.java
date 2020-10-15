package _6kyu.consecutive.repetition;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    // https://www.codewars.com/kata/586d6cefbcc21eed7a001155

    public static Object[] longestRepetition(String s) {

        char[] letters = s.toCharArray();
        int repetition = 1;
        int max = 0;
        String letter = "";
        for(int i = 1; i < letters.length; i++) {
            if (letters[i] == letters[i - 1]) {
                repetition++;
            } else {
                repetition = 1;
            }
            if (repetition > max) {
                max = repetition;
                letter = String.valueOf(letters[i]);
            }
        }
        return new Object[]{letter, max};
    }
}
