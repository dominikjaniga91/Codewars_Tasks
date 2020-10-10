package _7kyu.split.by.value;

import java.util.stream.IntStream;
import static java.util.Arrays.*;
public class StreamSolution {

    int[] splitByValue(int k, int[] elements) {
        return IntStream.concat(
                stream(elements).filter(n -> n < k),
                stream(elements).filter(n -> n >= k)
            ).toArray();
    }
}
