package _6kyu.bouncing.ball;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BouncingBallTest {

    private final double height;
    private final double bounce;
    private final double windowHeight;
    private final int result;

    public BouncingBallTest(double height, double bounce, double windowHeight, int result) {
        this.height = height;
        this.bounce = bounce;
        this.windowHeight = windowHeight;
        this.result = result;
    }

    @Test
    public void checkIfBouncingBallReturnAppropriateResult() {
        Assert.assertEquals(result, BouncingBall.bouncingBall(height, bounce, windowHeight));
    }
}

