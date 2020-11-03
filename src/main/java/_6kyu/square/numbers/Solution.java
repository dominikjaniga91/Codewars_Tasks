package _6kyu.square.numbers;


public class Solution {

    // https://www.codewars.com/kata/5edc8c53d7cede0032eb6029
    public static long solve(long n){
        for (long i = 1; i <= n; i++) {
            if (Math.sqrt(n + i * i) % 1 == 0) {
                return i*i;
            }
        }
        return -1;
    }
}
