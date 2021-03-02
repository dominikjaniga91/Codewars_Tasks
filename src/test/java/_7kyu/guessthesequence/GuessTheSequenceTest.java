package _7kyu.guessthesequence;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

public class GuessTheSequenceTest {

    @Test(dataProvider = "sequences")
    public void sequence_returnIntArrayWithNumbers_InLexicographicalOrder(int numberOfElements, int[] expected) {
        //when
        String actual = Arrays.toString(GuessTheSequence.sequence(numberOfElements));

        //then
        Assert.assertEquals(Arrays.toString(expected), actual);
    }

    @DataProvider
    private Object[][] sequences() {
        return new Object[][] {
                {16, new int[]{1, 10, 11, 12, 13, 14, 15, 16, 2, 3, 4, 5, 6, 7, 8, 9}},
                {9, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}},
                {21, new int[]{1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 2, 20, 21, 3, 4, 5, 6, 7, 8, 9}},
        };
    }
}
