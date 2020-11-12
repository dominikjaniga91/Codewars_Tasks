package _8kyu.reverse.words;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseWords {
    public static String reverse2(String sentence) {
        String[] arr = sentence.split(" ");
        return IntStream.rangeClosed(1, arr.length)
                .mapToObj(i -> arr[arr.length - i])
                .collect(Collectors.joining(" "));

    }

    public static String reverse(String sentence) {
        List<String> words = Arrays.asList(sentence.split(" "));
        Collections.reverse(words);
        return String.join(" ", words);
    }
}
