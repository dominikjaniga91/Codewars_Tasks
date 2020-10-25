package _6kyu.century;

import java.util.Map;

public class Solution{

    private static final Map<Character, String> ordinalNumbers = Map.of('1',"st", '2',"nd", '3',"rd");

    public static String whatCentury(int year) {
        int centuryNum = getCenturyNumber(year);
        String century = String.valueOf(centuryNum);
        return century + getNumeral(century);
    }

    private static int getCenturyNumber(int year) {
        return year % 100 == 0 ? year / 100
                               : year / 100 + 1;
    }

    public static String getNumeral(String century) {

        if (century.matches("1.")) {
            return "th";
        } else {
            char lastDigit = century.charAt(century.length() - 1);
            return ordinalNumbers.getOrDefault(lastDigit, "th");
        }
    }
}
