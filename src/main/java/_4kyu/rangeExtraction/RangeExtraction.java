package _4kyu.rangeExtraction;

import java.util.*;

public class RangeExtraction {

    // https://www.codewars.com/kata/51ba717bb08c1cd60f00002f/java

    public static String rangeExtraction(int[] arr) {

        List<List<Integer>> range = new LinkedList<>();
        List<Integer> temp = new LinkedList<>();
        int index = arr.length;
        int i = 0;

        while (i < index - 1) {
            temp.add(arr[i]);
            if (arr[i] + 1 != arr[i + 1] || i == arr.length - 2) {
                range.add(temp);
                if (temp.get(temp.size() - 1) + 1 == arr[arr.length - 1]) {
                    temp.add(arr[arr.length - 1]);
                }
                else if (i == arr.length - 2) {
                    temp = new LinkedList<>();
                    temp.add(arr[arr.length - 1]);
                    range.add(temp);
                }
                temp = new LinkedList<>();
            }
            i++;
        }
        return prepareView(range);
    }

    private static String prepareView(List<List<Integer>> range) {

        StringBuilder builder = new StringBuilder();
        for (List<Integer> tempList : range) {
            builder.append(tempList.get(0));
            if (tempList.size() == 2) {
                builder.append(",");
                builder.append(tempList.get(1));
            } else if (tempList.size() > 1) {
                builder.append("-");
                builder.append(tempList.get(tempList.size() - 1));
            }
            builder.append(",");
        }
        return builder.substring(0 , builder.length()-1);
    }
}
