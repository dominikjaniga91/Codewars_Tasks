package _8kyu.arrayPlusArray;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SumTest {

    @Test
    @DisplayName("Should return sum of numbers in all arrays")
    void shouldReturnSum_afterAddNumbersFromMultipleArrays() {

        int expectedSum = 28;

        int actualSum = Sum.arrayPlusArray(new int[]{4,5,6,3}, new int[]{1,2,3,4});

        assertEquals(expectedSum, actualSum);
    }
}