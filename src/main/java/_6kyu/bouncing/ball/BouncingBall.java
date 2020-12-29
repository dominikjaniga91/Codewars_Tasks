package _6kyu.bouncing.ball;

public class BouncingBall {

    public static int bouncingBall(double h, double bounce, double window) {

        if (bounce >= 1 || bounce <= 0 || h <= window) {
            return -1;
        }
        int counter = 1;
        double newHigh = h * bounce;
        while (newHigh > window) {
            newHigh *= bounce;
            counter += 2;
        }

        return counter;
    }
}
