package _7kyu.alphabet.symmetry;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

public class AlphabetTest {

    @Test(dataProvider = "arrays")
    public void shouldReturnAppropriateArray(int[] expected, String[] words) {
        int[] actual = Alphabet.solveWith(words);
        Assert.assertEquals(actual, expected);
    }


    @DataProvider
    private Object[][] arrays(){
        return new Object[][] {
                { new int[]{4,3,1}, new String[]{"abode","ABc","xyzD"}},
                { new int[]{4,3,0}, new String[]{"abide","ABc","xyz"}},
                { new int[]{6,5,7}, new String[]{"IAMDEFANDJKL", "thedefgh","xyzDEFghijabc"}},
                { new int[]{1,3,1,3}, new String[]{"encode","abc","xyzD","ABmD"}},
        };
    }
}
