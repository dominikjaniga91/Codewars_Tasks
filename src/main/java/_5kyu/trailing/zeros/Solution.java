package _5kyu.trailing.zeros;

public class Solution {

   // https://www.codewars.com/kata/52f787eb172a8b4ae1000a34/train

    public static int zeros(int n) {

        int z = 0;
        double kMax = Math.log10(n) / Math.log10(5);
        for (int i = 1; i <= kMax; i++) {
            z += n / Math.pow(5, i);
        }
        return z;
    }
}
