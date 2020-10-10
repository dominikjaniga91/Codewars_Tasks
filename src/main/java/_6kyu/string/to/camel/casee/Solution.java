package _6kyu.string.to.camel.casee;

import java.util.Arrays;
import java.util.stream.Collectors;

class Solution{

    static String toCamelCase(String s){
        var words = s.split("[^a-zA-Z]");
        var firstWord = words[0];
        var restOfWords = capitalizeFirstLetterInRestOfWords(words);
        return  firstWord + restOfWords;
    }

    private static String capitalizeFirstLetterInRestOfWords(String[] words) {
        return Arrays.stream(words)
                .skip(1)
                .map(Solution::firstLetterToUpperCase)
                .collect(Collectors.joining());
    }

    private static String firstLetterToUpperCase(String x) {
        return String.valueOf(x.charAt(0)).toUpperCase() + x.substring(1);
    }
}