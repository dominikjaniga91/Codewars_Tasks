package _6kyu.playing.with.digits;

public class DigPow {

    public static long digPow(int n, int p) {
        char[] digits = Integer.toString(n).toCharArray();
        int sum = 0;

        for (char digit : digits) {
            int number = Character.getNumericValue(digit);
            sum += Math.pow(number, p++);
        }

        return sum % n == 0 ? sum / n : -1;
    }
}
