package reversingString;

import java.util.stream.*;
import java.util.Arrays;

public class SpinWords3{

    public String spinWords(String sentence) {

        return Arrays.stream(sentence.split(" "))
                .map(i -> i.length() > 4 ? new StringBuilder(i).reverse().toString() : i)
                .collect(Collectors.joining(" "));
    }
}