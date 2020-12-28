package _7kyu.minmax.array;

import java.util.Arrays;

public class MinMax {

    public static int[] solve(int[] arr) {

        Arrays.sort(arr);
        int end = arr.length - 1;
        int[] newArr = new int[arr.length];
        int index = 0;
        for (int i = 0; i <= end / 2; i++) {
            newArr[index++] = arr[end - i];
            if (index < arr.length) {
                newArr[index++] = arr[i];
            }
        }
        return newArr;
    }
}
