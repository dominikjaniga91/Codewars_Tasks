package _7kyu.lineNumbering;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import static java.util.stream.Collectors.*;

public class LineNumbering {

    // https://www.codewars.com/kata/54bf85e3d5b56c7a05000cf9/train/java

    public static List<String> number(List<String> lines) {
        AtomicInteger i = new AtomicInteger(0);
        return lines.stream()
                .map(s -> i.incrementAndGet() + ": " + s)
                .collect(toList());
    }
}
