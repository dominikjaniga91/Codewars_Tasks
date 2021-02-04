package _6kyu.prizedraw;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.*;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

class Rank {

    // https://www.codewars.com/kata/5616868c81a0f281e500005c
    public static String nthRank(String st, Integer[] we, int n) {

        if (st.equals("")) {
            return "No participants";
        }

        if (we.length < n) {
            return "Not enough participants";
        }

        var names = Arrays.asList(st.split(","));
        var collect = names.stream().sorted(getReversed(we, names).reversed().thenComparing(naturalOrder())).collect(toList());
        return collect.get(n - 1);
    }

    private static Comparator<String> getReversed(Integer[] we, List<String> names) {
        return comparing(o -> winningNumber(o, we[names.indexOf(o)]));
    }

    static int winningNumber(String name, int position) {
        String lowerCase = name.toLowerCase();
        int sum = getSumOfLetters(lowerCase);
        return (sum + lowerCase.length()) * position;
    }

    static int getSumOfLetters(String lowerCase) {
        return lowerCase.chars().map(c -> c - 96).sum();
    }
}
