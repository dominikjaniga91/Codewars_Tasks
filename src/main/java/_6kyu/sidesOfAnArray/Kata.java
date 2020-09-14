package _6kyu.sidesOfAnArray;

public class Kata {

    // https://www.codewars.com/kata/5679aa472b8f57fb8c000047/train/java

    public static int findEvenIndex(int[] arr) {

        int leftSide = 0;
        for (int i = 0; i < arr.length; i++) {
            int rightSide = 0;
            for (int j = i + 1; j < arr.length; j++)
                rightSide += arr[j];
            if (leftSide == rightSide)
                return i;
            leftSide += arr[i];
        }
        return -1;
    }
}
