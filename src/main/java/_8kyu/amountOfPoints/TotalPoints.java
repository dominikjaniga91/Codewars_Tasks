package _8kyu.amountOfPoints;

import java.util.Arrays;
import static java.lang.Character.*;
public class TotalPoints {

    // https://www.codewars.com/kata/5bb904724c47249b10000131

    public static int points(String[] array) {
        return Arrays.stream(array)
                .map(TotalPoints::getPointFromSingleGame)
                .reduce(0, Integer::sum);
    }

    private static int getPointFromSingleGame(String result) {
        int x = getNumericValue(result.charAt(0));
        int y = getNumericValue(result.charAt(2));
        return x > y ? 3
                     : x == y ? 1
                              : 0;
    }
}
