package _7kyu.stantonmeasure;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StantonMeasureTest {

    @Test(dataProvider = "arraysWithMeasurement")
    public void shouldReturnThree_measureIntegerArray(int[] array, int expected) {

        int actual = StantonMeasure.stantonMeasure(array);
        Assert.assertEquals(actual, expected);
    }

    @DataProvider
    private Object[][] arraysWithMeasurement() {
        return new Object[][] {
                {new int[] {1, 4, 3, 2, 1, 2, 3, 2}, 3},
                {new int[] {1, 3, 2, 1, 1, 5, 3, 3, 3}, 4},
                {new int[] {1, 4, 3, 2, 1, 2, 2, 2 ,2}, 5},
                {new int[] {1, 1, 1, 1, 4, 3, 2, 2, 3, 2}, 1},
        };
    }
}
