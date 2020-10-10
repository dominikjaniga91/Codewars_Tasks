package _7kyu.fix.string.casee;

public class Solution {

    // https://www.codewars.com/kata/5b180e9fedaa564a7000009a/train/java

    public static String solve(final String str) {
        long lowerLetters = countLowerCaseLetters(str);
        double strHalf = (double) str.length() / 2;
        return lowerLetters >= strHalf ? str.toLowerCase()
                                       : str.toUpperCase();
    }

    private static long countLowerCaseLetters(String str) {
        return str.chars().filter(c -> c >= 'a' && c <= 'z').count();
    }
}
