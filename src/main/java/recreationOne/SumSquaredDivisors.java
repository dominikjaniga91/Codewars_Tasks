package recreationOne;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SumSquaredDivisors {

    // https://www.codewars.com/kata/55aa075506463dac6600010d/train/java

    public static String listSquared(long m, long n) {

        List<long[]> list = new LinkedList<>();

        for (long i = m; i <= n; i++) {
            int sum = 0;
            for (long j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sum += Math.pow(j, 2);
                }
            }
            if (Math.sqrt(sum) % 1 == 0) {
                list.add(new long[]{i, sum});
            }
        }
        return Arrays.deepToString(list.toArray());
    }
}
