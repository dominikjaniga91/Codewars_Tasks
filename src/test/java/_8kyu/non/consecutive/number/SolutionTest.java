package _8kyu.non.consecutive.number;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public final class SolutionTest {
    @Test public void basicTests() {
        assertEquals(6, Solution.find(new int[]{1, 2, 3, 4, 6, 7, 8}));
        assertEquals(-1, Solution.find(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
        assertEquals(6, Solution.find(new int[]{4, 6, 7, 8, 9, 11}));
        assertEquals(11, Solution.find(new int[]{4, 5, 6, 7, 8, 9, 11}));
        assertEquals(-1, Solution.find(new int[]{31, 32}));
        assertEquals(0, Solution.find(new int[]{-3, -2, 0, 1}));
        assertEquals(-1, Solution.find(new int[]{-5, -4, -3, -1}));
    }
}
