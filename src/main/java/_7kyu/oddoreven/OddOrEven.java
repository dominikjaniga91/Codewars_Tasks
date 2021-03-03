package _7kyu.oddoreven;

import java.util.stream.IntStream;

/**
 *
 * <a href="https://www.codewars.com/kata/5949481f86420f59480000e7">Link to task</>
 *
 * @author Dominik Janiga
 */
class OddOrEven {

    public static String oddOrEven (int[] array) {
        int sum = IntStream.of(array).sum();
        return (sum & 1) != 0 ? "odd" : "even";
    }
}
