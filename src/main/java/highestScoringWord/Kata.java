package highestScoringWord;

import java.util.Arrays;
import java.util.Comparator;

public class Kata {

    // https://www.codewars.com/kata/57eb8fcdf670e99d9b000272/java

    public static String high(String s) {
        return Arrays.stream(s.split(" "))
                .max(Comparator.comparing(Kata::wordScore))
                .orElse("");
    }

    private static int wordScore(String s) {
        return s.chars().map(c -> c - 96)
                .reduce(0, Integer::sum);
    }
}
