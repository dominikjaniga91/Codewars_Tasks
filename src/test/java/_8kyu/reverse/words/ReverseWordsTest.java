package _8kyu.reverse.words;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ReverseWordsTest {

    @ParameterizedTest
    @CsvSource({
        "I like eating, eating like I",
        "I like flying, flying like I",
        "The world is nice, nice is world The"
    })
    void shouldReturnStringWithReversedWords(String sentence, String expected) {
        String actual = ReverseWords.reverse(sentence);

        Assertions.assertEquals(expected, actual);
    }
}
