package _7kyu.arrayElementParity;

import static java.util.Arrays.*;

public class Solution {

    // https://www.codewars.com/kata/5a092d9e46d843b9db000064

    public static int solve(int [] arr){
        return stream(arr).distinct().sum();
    }
}
