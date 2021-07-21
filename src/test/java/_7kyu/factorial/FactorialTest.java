package _7kyu.factorial;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FactorialTest {

    private Factorial factorial;

    @BeforeMethod
    public void setUp() {
        factorial = new Factorial();
    }

    @Test(dataProvider = "numbers")
    public void factorial_returnCorrectResult_forGivenNumber(int number, int result) {
        //when
        long actual = this.factorial.factorial(number);

        //then
        Assertions.assertEquals(result, actual);
    }

    @DataProvider
    public static Object[][] numbers() {

        return new Object[][]{
                {3, 6},
                {4, 24},
                {5, 120},
                {6, 720},
                {7, 5040},
                {8, 40320},
                {9, 362880},
                {10, 3628800}
        };
    }
}
