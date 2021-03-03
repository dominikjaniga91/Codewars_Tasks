package _7kyu.oddoreven;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * @author Dominik Janiga
 */
public class OddOrEvenTest {

    @Test
    public void exampleTest() {
        assertEquals("odd", OddOrEven.oddOrEven(new int[] {2, 5, 34, 6}));
    }
}
