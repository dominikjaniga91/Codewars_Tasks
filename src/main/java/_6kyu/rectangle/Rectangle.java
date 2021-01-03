package _6kyu.rectangle;

import java.util.ArrayList;
import java.util.List;

public class Rectangle {

    // https://www.codewars.com/kata/55466989aeecab5aac00003e/train/java

    public static List<Integer> sqInRect(int length, int width) {

        if (length == width) {
            return null;
        }

        List<Integer> squares = new ArrayList<>();
        int singleSquares = length * width;

        while (singleSquares > 0) {
            int temp = length;
            length = Math.max(width, length);
            width = Math.min(width, temp);
            singleSquares -= Math.pow(width, 2);
            squares.add(width);
            length -= width;
        }
        return squares;
    }
}
