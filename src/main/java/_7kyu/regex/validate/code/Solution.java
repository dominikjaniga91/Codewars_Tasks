package _7kyu.regex.validate.code;

public class Solution {

    public static boolean validatePin(String pin) {
        return pin.matches("[0-9]{6}|[0-9]{4}");
    }
}
