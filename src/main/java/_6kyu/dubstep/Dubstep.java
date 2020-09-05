package _6kyu.dubstep;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Dubstep {

    // https://www.codewars.com/kata/551dc350bf4e526099000ae5/java

    public static String SongDecoder(String song) {

        return Arrays.stream(song.split("WUB"))
                .filter(word -> word.length() > 0)
                .collect(Collectors.joining(" "));
    }
}
