package _8kyu.arrayPlusArray;

import static java.util.Arrays.*;
import static java.util.stream.IntStream.*;

public class Sum {
    // https://www.codewars.com/kata/5a2be17aee1aaefe2a000151/train/java

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
         return concat(stream(arr1), stream(arr2)).sum();
    }
}
