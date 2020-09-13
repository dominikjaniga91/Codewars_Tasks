package _4kyu.stripComments;

import java.util.Arrays;
import java.util.Optional;

public class StripComments {

    // https://www.codewars.com/kata/51c8e37cee245da6b40000bd/train/java

    public static String stripComments(String text, String[] commentSymbols) {
        var regexp = Arrays.toString(commentSymbols).replaceAll("[ ,]", "").replace("]", ".*]");
        var strArray = text.split("\n");

        for (int i = 0; i < strArray.length; i++) {
            var symbol = getSymbol(strArray[i], regexp);
            if (symbol.isPresent()) {
                int index = strArray[i].indexOf(symbol.get());
                strArray[i] = strArray[i].substring(0, index);
            }
            strArray[i] = strArray[i].stripTrailing();
        }
        return String.join("\n", strArray);
    }

    private static Optional<String> getSymbol(String word, String regexp) {
        return word.chars()
                .mapToObj(Character::toString)
                .filter(s -> s.matches(regexp))
                .findFirst();
    }
}
