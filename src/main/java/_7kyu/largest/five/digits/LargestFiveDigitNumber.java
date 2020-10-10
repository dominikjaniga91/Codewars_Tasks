package _7kyu.largest.five.digits;

import java.util.stream.IntStream;

public class LargestFiveDigitNumber {

    public static int solve(final String digits) {
        return IntStream.rangeClosed(0, digits.length() - 5)
                .mapToObj(i -> digits.substring(i, i + 5))
                .map(Integer::parseInt)
                .max(Integer::compare)
                .orElse(0);
    }
}
