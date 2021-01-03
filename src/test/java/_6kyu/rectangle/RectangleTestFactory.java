package _6kyu.rectangle;

import org.testng.annotations.Factory;

import java.util.List;

public class RectangleTestFactory {

    @Factory
    public Object[] factoryMethod() {
        return new Object[]{
                new RectangleTest(5, 3, List.of(3, 2, 1, 1)),
                new RectangleTest(3, 5, List.of(3, 2, 1, 1)),
                new RectangleTest(6, 5, List.of(5, 1, 1, 1, 1, 1)),
                new RectangleTest(5, 6, List.of(5, 1, 1, 1, 1, 1)),
                new RectangleTest(5, 5, null),
        };
    }
}
