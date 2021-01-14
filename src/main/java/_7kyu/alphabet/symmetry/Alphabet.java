package _7kyu.alphabet.symmetry;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Alphabet {

    // https://www.codewars.com/kata/59d9ff9f7905dfeed50000b0

    // solution first
    public static int[] solveWith(String[] arr){
        return Arrays.stream(arr)
                .map(String::toLowerCase)
                .mapToInt(Alphabet::getNumberOfLetters)
                .toArray();
    }

    private static int getNumberOfLetters(String word) {
        return (int) IntStream.range(0, word.length())
                .filter(i -> hasAlphabetPosition(word, i))
                .count();
    }

    private static boolean hasAlphabetPosition(String lowerCases, int i) {
        int asciiCode = 97;
        return i == lowerCases.charAt(i) - asciiCode;
    }


}
