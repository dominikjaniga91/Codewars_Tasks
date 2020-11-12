package _8kyu.square.numbers;

// https://www.codewars.com/kata/515e271a311df0350d00000f/train/java

import java.util.Arrays;

public class Kata {
    public static int squareSum(int[] n) {
        return Arrays.stream(n).map(Kata::pow).sum();
    }

    private static int pow(int x){
        return (int) Math.pow(x, 2);
    }
}

