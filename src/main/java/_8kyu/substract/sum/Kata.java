package _8kyu.substract.sum;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;


public class Kata {

    public static String subtractSum (int n) {

        List<String> fruits = readFruitsFromFile();
        int result = n - digitsSum(n);
        while (result > 100) {
            result -= digitsSum(result);
        }
        return fruits.get(result - 1);
    }

    private static int digitsSum(int n) {
        String digits = String.valueOf(n);
        return digits.chars().map(Character::getNumericValue).sum();
    }

    private static List<String> readFruitsFromFile() {
        List<String> fruits = Collections.emptyList();
        try {
            fruits = Files.readAllLines(Path.of("src/main/resources/fruits.csv"));
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return fruits;
    }
}


