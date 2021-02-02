package _8kyu.wronghead;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class WrongEndHead {

    //https://www.codewars.com/kata/56f699cd9400f5b7d8000b55

    public static String[] fixTheMeerkat(String[] arr) {
        var collect = Arrays.asList(arr);
        Collections.reverse(collect);
        return collect.toArray(String[]::new);
    }
}
