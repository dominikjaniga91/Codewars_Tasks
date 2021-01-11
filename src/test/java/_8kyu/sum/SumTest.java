package _8kyu.sum;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SumTest {

    @Test
    public void basicTests() {
        assertEquals(9, Sum.sumOfDifferences(new int[]{1, 2, 10}));
        assertEquals(2, Sum.sumOfDifferences(new int[]{-3, -2, -1}));
        assertEquals(0, Sum.sumOfDifferences(new int[]{1, 1, 1, 1, 1}));
        assertEquals(34,Sum.sumOfDifferences(new int[]{-17, 17}));
        assertEquals(0, Sum.sumOfDifferences(new int[0]));
        assertEquals(0, Sum.sumOfDifferences(new int[]{0}));
        assertEquals(0, Sum.sumOfDifferences(new int[]{-1}));
        assertEquals(0, Sum.sumOfDifferences(new int[]{1}));
    }
}
