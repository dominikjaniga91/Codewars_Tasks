package _6kyu.bouncing.ball;

import org.testng.annotations.Factory;

public class BouncingBallTestFactory {

    @Factory
    public Object[] factoryMethod() {
        return new Object[] {
                new BouncingBallTest(3.0, 0.66, 1.5, 3),
                new BouncingBallTest(30.0, 0.66, 1.5, 15),
                new BouncingBallTest(3.0, 1, 1.5, -1),
                new BouncingBallTest(10.5, 0.6, 1.5, 7),
                new BouncingBallTest(5.0, 0.83, 5.0, -1),
                new BouncingBallTest(2.0, 0.5, 1.0, 1)
        };
    }
}
