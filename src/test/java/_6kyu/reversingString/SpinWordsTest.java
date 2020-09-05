package _6kyu.reversingString;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpinWordsTest {

        SpinWords spinWords = new SpinWords();

    @Test
    void shouldReturnStringWithReversedWordsBiggerThanFiveChars() {

        Assertions.assertEquals("emocleW", spinWords.spinWords("Welcome"));
        Assertions.assertEquals("Hey wollef sroirraw", spinWords.spinWords("Hey fellow warriors"));
    }
}
