package _5kyu.simple.pig.latin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PigLatinTest {

    @Test
    void FixedTests() {
        Assertions.assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt("Pig latin is cool"));
        Assertions.assertEquals("hisTay siay ymay tringsay", PigLatin.pigIt("This is my string"));
    }
}
