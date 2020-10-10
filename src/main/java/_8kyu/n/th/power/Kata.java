package _8kyu.n.th.power;
import static java.lang.Math.*;
public class Kata {

    // https://www.codewars.com/kata/57d814e4950d8489720008db

    public static int nthPower(int[] array, int n) {
        return n <= array.length - 1 ? (int) pow(array[n], n)
                                     : -1;
    }
}
