package _6kyu.prime.number;

import java.util.stream.LongStream;

public class StepInPrimes {

    // https://www.codewars.com/kata/5613d06cee1e7da6d5000055/train/java

    public static long[] step(int step, long start, long end) {

        for (long i = start; i <= end; i++) {
            if (isPrime(i) && isPrime(i + step)) {
                return new long[] {i, i + step};
            }
        }
        return null;
    }

    private static boolean isPrime(long number) {
        return LongStream.rangeClosed(2, (int) Math.sqrt(number))
                .allMatch(n -> number % n != 0);
    }
}
