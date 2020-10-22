package _7kyu.string.task;

import java.util.stream.Collectors;

public class StringTask {

    public static String perform(String word) {

        String consonants = word.toLowerCase()
                                .replaceAll("[aoyeu]", "");

        return consonants.chars()
                .mapToObj(s -> "." + Character.toString(s))
                .collect(Collectors.joining());
    }

}
