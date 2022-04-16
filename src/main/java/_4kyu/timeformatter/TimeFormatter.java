package _4kyu.timeformatter;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author Dominik_Janiga
 */
public class TimeFormatter {

    public String formatDuration(int seconds) {

        if (seconds == 0) {
            return "Now";
        }

        Map<TimePeriod, Integer> timePeriodsOccurrence = new EnumMap<>(TimePeriod.class);
        TimePeriod currentTimePeriod;

        while (seconds > 0) {

            currentTimePeriod = TimePeriod.of(seconds);
            timePeriodsOccurrence.merge(currentTimePeriod, 1, (k,v) -> v + 1);
            seconds -= currentTimePeriod.valueInSeconds;
        }
        return buildAnswer(timePeriodsOccurrence);
    }

    private String buildAnswer(Map<TimePeriod, Integer> timePeriodsOccurrence) {
        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;
        for (Entry<TimePeriod, Integer> timePeriodIntegerEntry : timePeriodsOccurrence.entrySet()) {

            Integer valueInSeconds = timePeriodIntegerEntry.getValue();
            stringBuilder.append(valueInSeconds);
            stringBuilder.append(" ");

            TimePeriod timePeriod = timePeriodIntegerEntry.getKey();
            String formattedName = timePeriod.getFormattedName(valueInSeconds);
            stringBuilder.append(formattedName);
            if (index == timePeriodsOccurrence.entrySet().size() - 2) {
                stringBuilder.append(" and ");
            } else if (index < timePeriodsOccurrence.entrySet().size() - 1) {
                stringBuilder.append(", ");
            }
            index++;
        }

        return stringBuilder.toString().trim();
    }

    enum TimePeriod {

        YEAR("year", 31536000),
        DAY("day", 86400),
        HOUR("hour", 3600),
        MINUTE("minute", 60),
        SECOND("second", 1);

        final private String name;
        final private int valueInSeconds;

        TimePeriod(String name, int valueInSeconds) {

            this.name = name;
            this.valueInSeconds = valueInSeconds;
        }

        static TimePeriod of(int seconds) {

            return Arrays.stream(values())
                    .filter(v -> seconds >= v.valueInSeconds)
                    .findFirst()
                    .orElse(null);
        }

        String getFormattedName(int value) {
            return value == 1 ? name : name + "s";
        }
    }
}
