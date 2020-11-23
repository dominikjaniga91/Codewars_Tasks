package _7kyu.maximum.product;

import java.util.stream.IntStream;

public class MaxProduct {
    public int adjacentElementsProduct(int[] array) {
        return IntStream.range(1, array.length)
                        .map(i -> array[i - 1] * array[i])
                        .max()
                        .orElse(0);
    }
}
