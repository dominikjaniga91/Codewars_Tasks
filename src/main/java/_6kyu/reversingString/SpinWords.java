package _6kyu.reversingString;

public class SpinWords {

    public String spinWords(String sentence) {

        // https://www.codewars.com/kata/5264d2b162488dc400000001

        String[] words = sentence.split(" ");
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= 5) {
                words[i] = reverseWord(words[i]);
            }
            builder.append(words[i]);
            if (i != words.length - 1) {
                builder.append(" ");
            }
        }

        return builder.toString();
    }

    public String reverseWord(String word) {
        char[] chars = word.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--){
            builder.append(chars[i]);
        }
        return builder.toString();
    }
}
