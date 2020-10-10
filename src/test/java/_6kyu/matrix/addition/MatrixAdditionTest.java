package _6kyu.matrix.addition;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MatrixAdditionTest {

    @Test
    public void shouldReturnAppropriateArray_afterAddMatrix3x3() {
        int[][] expected = new int[][] { { 3, 4, 4 }, { 6, 4, 4 }, { 2, 2, 4 } };

        assertArrayEquals(expected,
                MatrixAddition.matrixAddition(
                        new int[][] { { 1, 2, 3 }, { 3, 2, 1 }, { 1, 1, 1 } },
                        new int[][] { { 2, 2, 1 }, { 3, 2, 3 }, { 1, 1, 3 } }));
    }

    @Test
    public void  shouldReturnAppropriateArray_afterAddMatrix1x1() {
        int[][] expected = new int[][] { { 3 } };

        assertArrayEquals(expected,
                MatrixAddition.matrixAddition(
                        new int[][] { { 1 } },
                        new int[][] { { 2 } }));
    }

    @Test
    public void shouldReturnAppropriateArray_afterAddMatrix2x2() {
        int[][] expected = new int[][] { { 3, 5 }, { 3, 5 } };

        assertArrayEquals(expected,
                MatrixAddition.matrixAddition(
                        new int[][] { { 1, 2 }, { 1, 2 } },
                        new int[][] { { 2, 3 }, { 2, 3 } }));
    }
}
