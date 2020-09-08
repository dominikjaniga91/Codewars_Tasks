package _7kyu.splitByValue;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;

public class SolutionTest {
    @Test
    public void testCase1() {
        Solution sol = new Solution();
        assertEquals(Arrays.toString(new int[] {1, 3, 4, 2, 5, 7, 6}),Arrays.toString(sol.splitByValue(5, new int[] {1, 3, 5, 7, 6, 4, 2})));
        assertEquals(Arrays.toString(new int[] {5, 2, 7, 3, 2}),Arrays.toString(sol.splitByValue(0, new int[] {5, 2, 7, 3, 2})));
        assertEquals(Arrays.toString(new int[] {4, 6, 10, 10, 6}),Arrays.toString(sol.splitByValue(6, new int[] {6, 4, 10, 10, 6})));
        assertEquals(Arrays.toString(new int[] {6, 2, 7, 5, 2, 1, 1, 9, 9}),Arrays.toString(sol.splitByValue(9, new int[] {6, 9, 2, 7, 5, 2, 1, 1, 9})));
        assertEquals(Arrays.toString(new int[] {1, 2, 9, 8, 2, 8, 3, 7, 6}),Arrays.toString(sol.splitByValue(2, new int[] {2, 9, 1, 8, 2, 8, 3, 7, 6})));
    }
}
