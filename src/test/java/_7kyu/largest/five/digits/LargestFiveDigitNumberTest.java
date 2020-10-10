package _7kyu.largest.five.digits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LargestFiveDigitNumberTest {

    @Test
    void shouldReturn83910Number() {
        int expected = 83910;
        int actual = LargestFiveDigitNumber.solve("283910");
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldReturn67890Number() {
        int expected = 67890;
        int actual = LargestFiveDigitNumber.solve("1234567890");
        Assertions.assertEquals(expected, actual);

    }
}
