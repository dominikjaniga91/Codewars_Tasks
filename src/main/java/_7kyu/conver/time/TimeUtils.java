package _7kyu.conver.time;

public class TimeUtils {

    // https://www.codewars.com/kata/5502ddd734137e90af000f62
    public static String convertTime(int timeDiff) {

        int days = timeDiff / 86400;
        int hours = timeDiff % 86400 / 3600;
        int minutes = timeDiff % 3600 / 60;
        int seconds = timeDiff % 60;
        return String.format("%d %d %d %d", days, hours, minutes, seconds);
    }
}
