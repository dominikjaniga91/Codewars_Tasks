package rangeExtraction;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RangeExtractionTest {

    @Test
    public void test_BasicTests() {

        assertEquals("-6,-3-1,3-5,7-11,14,15,17-20", RangeExtraction.rangeExtraction (new int[] {-6,-3,-2,-1,0,1,3,4,5,7,8,9,10,11,14,15,17,18,19,20}));
        assertEquals("-3--1,2,10,15,16,18-20", RangeExtraction.rangeExtraction(new int[] {-3,-2,-1,2,10,15,16,18,19,20}));
        assertEquals("-25,-24,-21,-20,-18,-15,-12,-9,-6,-3,-1,2,3,5,7,9,12,14,17,18,20,23,26-28,30,32,34-39,42", RangeExtraction.rangeExtraction(new int[] {-25, -24, -21, -20, -18, -15, -12, -9, -6, -3, -1, 2, 3, 5, 7, 9, 12, 14, 17, 18, 20, 23, 26, 27, 28, 30, 32, 34, 35, 36, 37, 38, 39, 42}));
    }
}