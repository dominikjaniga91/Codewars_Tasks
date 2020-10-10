package _7kyu.max.diff;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void BasicTests() {

        assertEquals("only positives", 4, Solution.maxDiff(new int[]{ 1, 2, 3, 4, 5, 5, 4 }));
        assertEquals("only negatives", 30, Solution.maxDiff(new int[]{ -4, -5, -3, -1, -31 }));
        assertEquals("positives and negatives", 10, Solution.maxDiff(new int[]{ 1, 2, 3, 4, -5, 5, 4 }));
        assertEquals("single element", 0, Solution.maxDiff(new int[]{ 1000000 }));
        assertEquals("empty", 0, Solution.maxDiff(new int[]{}));
    }

}
