package _7kyu.guessthesequence;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class GuessTheSequenceTest {

    @Test
    public void test0() {
        int[] result = {1, 10, 11, 12, 13, 14, 15, 16, 2, 3, 4, 5, 6, 7, 8, 9};
        int x = 16;
        String expected = Arrays.toString(result),
                actual = Arrays.toString(GuessTheSequence.sequence(x));
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        int[] result = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int x = 9;
        String expected = Arrays.toString(result),
                actual = Arrays.toString(GuessTheSequence.sequence(x));
        Assert.assertEquals(expected, actual);
    }
}
