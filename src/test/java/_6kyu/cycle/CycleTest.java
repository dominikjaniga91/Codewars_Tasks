package _6kyu.cycle;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CycleTest {
    private static void dotest(int n, int expected) {
        int actual = Cycle.cycle(n);
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        dotest(21, 6);
        dotest(33, 2);
        dotest(18118, -1);
        dotest(69, 22);
        dotest(197, 98);
        dotest(65, -1);
    }
}
