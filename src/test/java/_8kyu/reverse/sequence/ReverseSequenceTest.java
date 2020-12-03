package _8kyu.reverse.sequence;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ReverseSequenceTest {

    @Test
    public void simpleTest() {
        assertArrayEquals(new int[]{5,4,3,2,1}, ReverseSequence.reverse(5));
    }
}
