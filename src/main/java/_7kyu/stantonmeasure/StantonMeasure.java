package _7kyu.stantonmeasure;

import java.util.stream.IntStream;

public class StantonMeasure {

    //https://www.codewars.com/kata/59a1cdde9f922b83ee00003b
    public static int stantonMeasure(int[] arr) {

        long ones = count(1, arr);
        long count = count(ones, arr);
        return (int) count;
    }

    private static long count(long occurrence, int[] arr) {
        return IntStream.of(arr).filter(i -> i == occurrence).count();
    }
}
