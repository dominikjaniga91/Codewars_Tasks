package _6kyu.prime.number;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StepInPrimesTest {

    private final int step;
    private final int start;
    private final int end;
    private final long[] result;

    public StepInPrimesTest(int step, int start, int end, long[] result) {
        this.step = step;
        this.start = start;
        this.end = end;
        this.result = result;
    }

    @Test
    public void shouldReturnPairOfNumbersWithRightStep() {
        Assert.assertEquals(result, StepInPrimes.step(step, start, end));
    }
}
