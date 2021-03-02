package _7kyu.guessthesequence;

import static java.util.stream.IntStream.rangeClosed;

/**
 * @author Dominik Janiga
 *
 * <a href="https://www.codewars.com/kata/5b45e4b3f41dd36bf9000090">Link to task</>
 *
 */
class GuessTheSequence {
    static int[] sequence(int x) {
        return rangeClosed(1, x)
                .mapToObj(String::valueOf)
                .sorted()
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
