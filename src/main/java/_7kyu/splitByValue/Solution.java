package _7kyu.splitByValue;

public class Solution {

    int[] splitByValue(int k, int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            if (k <= elements[i]) {
                for (int j = 0; j < elements.length; j++) {
                    if (elements[j] < k && j > i) {
                        int temp = elements[j];
                        elements[j] = elements[j - 1];
                        elements[j - 1] = temp;
                        i = -1;
                    }
                }
            }
        }
        return elements;
    }
}
// https://www.codewars.com/kata/5a433c7a8f27f23bb00000dc