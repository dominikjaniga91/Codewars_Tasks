package _6kyu.findodd;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FindOddTest {

    @Test(dataProvider = "integerArrays")
    public void checkIfFindItMethodReturnAppropriateResult(int expected, int[] array) {
        int actual = FindOdd.findIt(array);
        Assert.assertEquals(expected, actual);
    }

    @DataProvider
    public static Object[][] integerArrays() {
        return  new Object[][]{
                {5, new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}},
                {-1, new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}},
                {5, new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}  },
                {10, new int[]{10}},
                {10, new int[]{1,1,1,1,1,1,10,1,1,1,1}},
                {1, new int[]{5,4,3,2,1,5,4,3,2,10,10}},
        };
    }
}
