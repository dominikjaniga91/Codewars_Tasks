package _6kyu.smiley.faces;

import java.util.List;

public class SmileFaces {

    // https://www.codewars.com/kata/583203e6eb35d7980400002a/java

    public static int countSmileys(List<String> arr) {

        return (int)arr.stream()
                .filter(a -> a.matches("[:;][~-]?[)D]"))
                .count();
    }
}
