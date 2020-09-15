package _8kyu.areaOrPerimiter;

public class Solution {

    // https://www.codewars.com/kata/5ab6538b379d20ad880000ab/train/java
    public static int areaOrPerimeter (int l, int w) {
        return l == w ? l * w
                      : 2 * (l + w);
    }
}
