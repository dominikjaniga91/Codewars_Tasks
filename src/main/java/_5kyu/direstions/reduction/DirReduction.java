package _5kyu.direstions.reduction;

import java.util.*;

public class DirReduction {

    // https://www.codewars.com/kata/550f22f4d758534c1100025a/java

    public static String[] dirReduc(String[] arr) {

        List<String> list = new ArrayList<>(List.of(arr));
        boolean notOpposite = false;

        while (!notOpposite) {
            int indexToRemove = 0;
            notOpposite = true;

            for (int i = 1; i < list.size(); i++) {
                if (areOpposite(list, i)) {
                    notOpposite = false;
                    indexToRemove = i - 1;
                    break;
                }
            }
            if (!notOpposite) {
                list.remove(indexToRemove);
                list.remove(indexToRemove);
            }
        }
        return list.toArray(new String[0]);
    }

    private static boolean areOpposite(List<String> list, int i){
        return Directions.valueOf(list.get(i - 1)).x + Directions.valueOf(list.get(i)).x == 0;
    }

    enum Directions {
        NORTH(1), SOUTH(-1), EAST(2), WEST(-2);
        int x;
        Directions(int x) {
            this.x = x;
        }
    }
}
