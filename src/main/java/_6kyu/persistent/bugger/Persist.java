package _6kyu.persistent.bugger;

public class Persist {

    // https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec/java

    public static int persistence(long n) {

        int steps = 0;

        while (String.valueOf(n).length() > 1) {
            String number = String.valueOf(n);
            char[] characters = number.toCharArray();
            int x = Character.getNumericValue(characters[0]);
            steps++;

            for (int i = 1; i < characters.length; i++) {
                x *= Character.getNumericValue(characters[i]);
            }
            n = x;
        }

        return steps;
    }

}
