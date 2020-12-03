package _8kyu.reverse.sequence;

import java.util.stream.IntStream;

class ReverseSequence {

    // https://www.codewars.com/kata/5a00e05cc374cb34d100000d/train/java
    public static int[] reverse(int n){
        return IntStream.iterate(n, i -> i - 1).limit(n).toArray();
    }
}
