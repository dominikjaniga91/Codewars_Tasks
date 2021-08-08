package _7kyu.beads.count;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BeadsCountTest {

    @Test
    public void test0() {

        assertEquals(0, BeadsCount.countRedBeads(0));
    }

    @Test
    public void test1() {

        assertEquals(0, BeadsCount.countRedBeads(1));
    }

    @Test
    public void test3() {

        assertEquals(4, BeadsCount.countRedBeads(3));
    }

    @Test
    public void test5() {

        assertEquals(8, BeadsCount.countRedBeads(5));
    }
}
