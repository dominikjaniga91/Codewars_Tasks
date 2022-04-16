package _3kyu.spiral;

/**
 * @author Dominik_Janiga
 */
public class Spiralizor {

    public static int[][] spiralize(int size) {

        String[][] spiralArray = new String[size][size];

        int start = 0;
        int end = size - 1;
        int i = 0;
        int row = 0;

        while (i < size) {

            if (i % 4 == 0) {
                end -= 2;
            }
            fillArrayHorizontally(spiralArray, row, start, end);
            start = row;
            fillArrayVertically(spiralArray, end, start, end);
            start = end;
            end = i;
            i++;
        }
        return null;
    }

    static void fillArrayVertically(String[][] spiralArray, int column, int start, int end) {

        for (int i = start ; i <= end ; i++) {
            spiralArray[i][column] = "0";
        }

    }

    static void fillArrayHorizontally(String[][] spiralArray, int row, int start, int end) {
        for (int i = start ; i <= end ; i++) {
            spiralArray[row][i] = "0";
        }
    }
}
