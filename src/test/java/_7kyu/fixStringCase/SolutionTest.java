package _7kyu.fixStringCase;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {


    @Test
    public void BasicTests() {
        assertEquals("code", Solution.solve("code"));
        assertEquals("CODE", Solution.solve("CODe"));
        assertEquals("code", Solution.solve("COde"));
        assertEquals("code", Solution.solve("Code"));
        assertEquals("", Solution.solve(""));
        assertEquals("IYTMJXKZUAELHABEFERTAKQXV", Solution.solve("iyTmJXKZuaElHAbeFErTaKQxv"));
    }
}
