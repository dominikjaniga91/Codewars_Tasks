package _7kyu.minmax.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MinMaxTest {

    @Test
    public void basicTests(){
        assertArrayEquals(new int[]{15,7,12,10,11},MinMax.solve(new int[]{15,11,10,7,12}));
        assertArrayEquals(new int[]{15,7,12,10,11},MinMax.solve(new int[]{15,11,10,7,12}));
        assertArrayEquals(new int[]{15,7,12,10,11},MinMax.solve(new int[]{15,11,10,7,12}));
    }
}
