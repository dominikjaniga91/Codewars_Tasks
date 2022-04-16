package _4kyu.pyramid.slide.down;

import java.util.Comparator;
import java.util.stream.Stream;

public class LongestSlideDown {

    public static int longestSlideDown(int[][] pyramid) {

        int currentPositionInRow = 0;
        int sum = pyramid[0][0];

        for (int i = 1; i < pyramid.length; i++) {
            int[] elements = pyramid[i];

            for (int j = 0; j < elements.length; j++) {

                if (currentPositionInRow == j) {

                    if (j == elements.length - 1) {

                        Node max = max(new Node(j, elements[j]), new Node(j - 1, elements[j - 1]));
                        currentPositionInRow = max.index;
                        System.out.println(" max1 "  + max.value);
                        sum += max.value;
                        break;
                    } else {

                        Node max = max(new Node(j, elements[j]), new Node(j + 1, elements[j + 1]));
                        currentPositionInRow = max.index;
                        System.out.println(" max2 "  + max.value);
                        sum += max.value;
                        break;
                    }
                }
            }
        }

        return sum;
    }

    static Node max(Node... numbers) {

        return Stream.of(numbers).max(Comparator.comparing(Node::getValue)).get();
    }

    static class Node {

        private final int index;
        private final int value;

        public Node(int index, int value) {

            this.index = index;
            this.value = value;
        }

        public int getValue() {

            return value;
        }
    }
}