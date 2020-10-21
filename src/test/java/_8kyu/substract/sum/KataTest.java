package _8kyu.substract.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {

    @Test
    public void basicTest() {
        assertEquals("apple", Kata.subtractSum(10));
    }

    @Test
    public void basicTest2() {
        assertEquals("apple", Kata.subtractSum(6376));
    }
}
