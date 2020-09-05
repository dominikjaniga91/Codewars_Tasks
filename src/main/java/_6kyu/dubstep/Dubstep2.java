package _6kyu.dubstep;

public class Dubstep2 {

    // https://www.codewars.com/kata/551dc350bf4e526099000ae5/java

    public static String SongDecoder(String song) {

        return song.replaceAll("(WUB)+", " ").trim();
    }
}
