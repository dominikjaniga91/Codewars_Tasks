package _7kyu.sumofnumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumTest {

    Sum s = new Sum();

    @Test
    public void Test1()
    {
        assertEquals(-1, s.GetSum(0, -1));
        assertEquals(1, s.GetSum(0, 1));
        assertEquals(3, s.GetSum(1, 2));
        assertEquals(1, s.GetSum(1, 1));
        assertEquals(2, s.GetSum(-1, 2));
        assertEquals(-1, s.GetSum(-1, -1));
        assertEquals(-11, s.GetSum(-6, -5));
    }
}
