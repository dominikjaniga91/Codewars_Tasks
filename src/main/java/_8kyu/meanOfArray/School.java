package _8kyu.meanOfArray;

import java.util.Arrays;

public class School {

    // https://www.codewars.com/kata/563e320cee5dddcf77000158

    public static int getAverage(int[] marks){
        return Arrays.stream(marks).sum() / marks.length;
    }
}
