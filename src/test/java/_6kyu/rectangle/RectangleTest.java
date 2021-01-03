package _6kyu.rectangle;

import org.testng.annotations.Test;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class RectangleTest {

    private final int length;
    private final int width;
    private final List<Integer> result;

    public RectangleTest(int length, int width, List<Integer> result) {
        this.length = length;
        this.width = width;
        this.result = result;
    }

    @Test
    public void test1() {
        assertEquals(result, Rectangle.sqInRect(length, width));
    }
}
