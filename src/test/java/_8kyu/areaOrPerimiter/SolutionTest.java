package _8kyu.areaOrPerimiter;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void basicTests() {
         assertEquals(18, Solution.areaOrPerimeter(4 ,5));
         assertEquals(16, Solution.areaOrPerimeter(4 ,4));
         assertEquals(30, Solution.areaOrPerimeter(3 ,12));
         assertEquals(25, Solution.areaOrPerimeter(5 ,5));
         assertEquals(14, Solution.areaOrPerimeter(6 ,1));
    }
}
