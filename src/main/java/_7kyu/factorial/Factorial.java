package _7kyu.factorial;

import java.util.stream.IntStream;

/**
 * https://www.codewars.com/kata/54ff0d1f355cfd20e60001fc
 *
 * @author Dominik_Janiga
 */
public class Factorial {

    public int factorial(int n) {
        if (n < 0 || n > 12) {
            throw new IllegalArgumentException();
        }
        return IntStream.rangeClosed(1, n).reduce(1, (a,b) -> a * b);
    }
}
