package _7kyu.extendedWeekend;

import java.time.*;;
import java.util.LinkedList;

public class ExtendedWeekend {

    // https://www.codewars.com/kata/5be7f613f59e0355ee00000f/train/java

    public static String[] solve(int startYear, int endYear) {

        var months = new LinkedList<String>();
        while (startYear <= endYear) {
            for (Month month : Month.values()) {
                if (hasExtendedWeekend(month, startYear)) {
                    months.add(month.toString());
                }
            }
            startYear++;
        }
        return new String[]{months.getFirst(), months.getLast(), String.valueOf(months.size())};
    }

    private static boolean hasExtendedWeekend(Month month, int year) {
        int days = month.length(Year.isLeap(year));
        return LocalDate.of(year, month, 1).getDayOfWeek().equals(DayOfWeek.FRIDAY)
                && LocalDate.of(year, month, days).getDayOfWeek().equals(DayOfWeek.SUNDAY);
    }
}
