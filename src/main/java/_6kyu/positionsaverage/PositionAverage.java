package _6kyu.positionsaverage;

import java.util.Arrays;
import static java.util.stream.IntStream.range;

/**
 * <a href="https://www.codewars.com/kata/59f4a0acbee84576800000af/train/java">Link to task</>
 *
 * @author Dominik Janiga
 */
class PositionAverage {
    public static double posAverage(String s) {
        String[] words = s.split(", ");
        int commonPositions = 0;

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                commonPositions += getCommonPositions(words[i], words[j]);
            }
        }
        int combinations = allCombinations(words);
        return (double) commonPositions / combinations * 100;
    }

    private static int getCommonPositions(String first, String second) {
        int commonPositions = 0;
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) == second.charAt(i)) {
                commonPositions++;
            }
        }
        return commonPositions;
    }

    private static int allCombinations(String[] words) {
        int sum = range(0, words.length).sum();
        return sum * words[0].length();
    }
}
