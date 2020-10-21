package _6kyu.order;

import java.util.Arrays;
import java.util.Comparator;

public class Order {
    public static String order(String words) {
        String[] wordsArr = words.split(" ");
        return Arrays.stream(wordsArr)
                .sorted(Comparator.comparing(s -> s.replaceAll("[a-zA-Z]", "")))
                .reduce((prev, next) -> prev + " " + next)
                .orElseThrow();
    }
}
