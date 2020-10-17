package _5kyu.simple.pig.latin;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PigLatin {

    // https://www.codewars.com/kata/520b9d2ad5c005041100000f

    public static String pigIt(String str)  {
        return Arrays.stream(str.split(" "))
                .map(PigLatin::changeLetterOrder)
                .collect(Collectors.joining(" "));
    }

    private static String changeLetterOrder(String word) {
        if (word.matches("[a-zA-Z]+")) {
            return word.substring(1) + word.charAt(0) + "ay";
        }
        return word;
    }
}
