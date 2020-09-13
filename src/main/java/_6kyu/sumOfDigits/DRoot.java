package _6kyu.sumOfDigits;

public class DRoot {

    // https://www.codewars.com/kata/541c8630095125aba6000c00

    public static int digital_root(int i) {
        while (i > 9) {
            i = i / 10 + i % 10;
        }
        return i;
    }
}
