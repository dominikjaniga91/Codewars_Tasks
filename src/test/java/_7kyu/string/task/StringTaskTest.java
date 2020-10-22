package _7kyu.string.task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringTaskTest {

    @Test
    public void perform() throws Exception {
        assertEquals( ".t.r", StringTask.perform( "tour" ) );
        assertEquals( ".c.d.w.r.s", StringTask.perform( "Codewars" ) );
        assertEquals( ".b.c.b", StringTask.perform( "aBAcAba" ) );
    }
}
