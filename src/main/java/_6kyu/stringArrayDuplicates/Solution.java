package _6kyu.stringArrayDuplicates;

public class Solution {

    // https://www.codewars.com/kata/59f08f89a5e129c543000069/train/java

    public static String[] removeDuplicates(String[] arr) {

       var newArr = new String[arr.length];
        for (int j = 0; j < arr.length; j++) {
            var builder = new StringBuilder();
            var temp = arr[j].toCharArray();
            builder.append(temp[0]);
            for (int i = 1; i < temp.length; i++) {
                if (!builder.toString().endsWith(String.valueOf(temp[i])))
                    builder.append(temp[i]);
            }
            newArr[j] = builder.toString();
        }
        return newArr;
    }
}
