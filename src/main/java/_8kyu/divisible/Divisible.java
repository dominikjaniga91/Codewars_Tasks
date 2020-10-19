package _8kyu.divisible;

public class Divisible {

    static boolean isDivisible(long n, long a, long b) {
        return n % a == 0 && n % b == 0;
    }
}
