package _8kyu.divisible;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DivisibleTest {

    @Test
    public void shouldReturnTrue_afterDivisionNbyAB() {
        assertTrue(Divisible.isDivisible(12, 4, 3));
    }
    @Test
    public void shouldReturnFalse_afterDivisionNbyAB() {
        assertFalse(Divisible.isDivisible(3, 3, 4));
    }
}
