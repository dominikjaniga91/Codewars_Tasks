package _7kyu.wordValues;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {


    @Test
    @DisplayName("Should return integer array with words values")
    void shouldReturnIntArrayWIthWordsValues() {
        assertArrayEquals(new int[]{6,24},Solution.nameValue(new String[]{"abc","abc abc"}));
//        assertEquals(new int[]{88,12,225},Solution.nameValue(new String[]{"codewars","abc","xyz"}));
//        assertEquals(new int[]{351,282,330},Solution.nameValue(new String[]{"abcdefghijklmnopqrstuvwxyz","stamford bridge","haskellers"}));
    }
}
