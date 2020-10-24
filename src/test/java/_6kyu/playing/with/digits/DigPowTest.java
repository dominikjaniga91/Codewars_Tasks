package _6kyu.playing.with.digits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DigPowTest {


    @Test
    void shouldReturnMultiplyNumber_afterPowEveryDigit() {
        long expected = 51L;

        long actual = DigPow.digPow(46288, 3);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMinusOne_afterPowEveryDigit() {
        long expected = -1;

        long actual = DigPow.digPow(92, 1);

        Assertions.assertEquals(expected, actual);
    }
}
