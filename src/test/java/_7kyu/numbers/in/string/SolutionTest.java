package _7kyu.numbers.in.string;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void basicTests(){
        assertEquals(9,Solution.solve("2ti9iei7qhr5"));
        assertEquals(695,Solution.solve("gh12cdy695m1"));
        assertEquals(85,Solution.solve("lu1j8qbbb85"));
        assertEquals(185,Solution.solve("185lu1j8qbbb85"));
    }
}
