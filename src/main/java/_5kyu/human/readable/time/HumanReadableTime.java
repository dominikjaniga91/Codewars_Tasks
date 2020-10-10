package _5kyu.human.readable.time;

public class HumanReadableTime {

    // https://www.codewars.com/kata/52685f7382004e774f0001f7/java

    public static String makeReadable(int seconds) {

        int hh = seconds / 3600;
        int mm = (seconds % 3600) / 60;
        int ss = seconds % 3600 % 60;

        return String.format("%02d:%02d:%02d", hh, mm, ss);
    }
}
