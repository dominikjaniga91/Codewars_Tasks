package _4kyu.theObservedPin;

import java.util.*;
import java.util.stream.Collectors;

public class ObservedPin {

    //  https://www.codewars.com/kata/5263c6999e0f40dee200059d/java

    static Map<Character, int[]> pinTable = Map.of('1', new int[]{1, 2, 4},
                                                    '2', new int[]{1, 2, 3, 5},
                                                    '3', new int[]{2, 3, 6},
                                                    '4', new int[]{1, 4, 5, 7},
                                                    '5', new int[]{2, 4, 5, 6, 8},
                                                    '6', new int[]{3, 5, 6, 9},
                                                    '7', new int[]{4, 7, 8},
                                                    '8', new int[]{5, 7, 8, 9, 0},
                                                    '9', new int[]{6, 8, 9},
                                                    '0', new int[]{0, 8});
    
    public static List<String> getPINs(String entered) {

        var possibilities = new LinkedList<String>();
        getPossibilities(possibilities, new int[entered.length()], 0, entered);

        return possibilities;
    }

    private static void getPossibilities(List<String> results, int[] data, int index, String input) {

        char object = input.charAt(index);
        int[] tempArr = pinTable.get(object);

        for (int j : tempArr) {
            data[index] = j;
            if (index == input.length() - 1) {
                results.add(toString(data));
            } else {
                getPossibilities(results, data, index + 1, input);
            }
        }
    }

    private static String toString(int[] data){
        return Arrays.stream(data)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining());
    }
}