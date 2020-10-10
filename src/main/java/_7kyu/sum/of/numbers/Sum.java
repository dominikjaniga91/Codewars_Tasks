package _7kyu.sum.of.numbers;

public class Sum {

    // https://www.codewars.com/kata/55f2b110f61eb01779000053/java

    public int GetSum(int a, int b)
    {
        int start = Math.min(a, b);
        int end = Math.max(a, b);
        int result = 0;

        while (start <= end) {
            result += start;
            start++;
        }

        return result;
    }
}
