package _7kyu.alphabet.symmetry;

public class AlphabetSymmetry {

    // https://www.codewars.com/kata/59d9ff9f7905dfeed50000b0

    // solution first
    public static int[] solveWithFor(String[] arr){
        int[] amountOfLetters = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            amountOfLetters[i] = getNumberOfLettersWithRightPosition(arr[i]);
        }
        return amountOfLetters;
    }

    private static int getNumberOfLettersWithRightPosition(String word) {
        int counter = 0;
        char[] letters = word.toLowerCase().toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] - 97 == i) {
                counter++;
            }
        }
        return counter;
    }


}
