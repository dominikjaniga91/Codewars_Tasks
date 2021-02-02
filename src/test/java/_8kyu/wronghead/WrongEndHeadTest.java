package _8kyu.wronghead;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WrongEndHeadTest {

    @Test
    public void exampleTest1() {
        assertEquals(new String[]{ "head", "body", "tail" },
                WrongEndHead.fixTheMeerkat(new String[]{ "tail", "body", "head" }));
    }

    @Test
    public void exampleTest2() {
        assertEquals(new String[]{ "heads", "body", "tails" },
                WrongEndHead.fixTheMeerkat(new String[]{ "tails", "body", "heads" }));
    }


    @Test
    public void exampleTest3() {
        assertEquals(new String[]{ "top", "middle", "bottom" },
                WrongEndHead.fixTheMeerkat(new String[]{ "bottom", "middle", "top" }));
    }

    @Test
    public void exampleTest4() {
        assertEquals(new String[]{ "upper legs", "torso", "lower legs" },
                WrongEndHead.fixTheMeerkat(new String[]{ "lower legs", "torso", "upper legs" }));
    }

    @Test
    public void exampleTest5() {
        assertEquals(new String[]{ "sky", "rainbow", "ground" },
                WrongEndHead.fixTheMeerkat(new String[]{ "ground", "rainbow", "sky" }));
    }
}
