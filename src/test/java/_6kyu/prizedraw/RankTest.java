package _6kyu.prizedraw;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class RankTest {

    @Test
    public void test() {
        System.out.println("Fixed Tests");
        String st = "";
        Integer[] we = new Integer[] {4, 2, 1, 4, 3, 1, 2};
        assertEquals("No participants", Rank.nthRank(st, we, 4));

        st = "Addison,Jayden,Sofia,Michael,Andrew,Lily,Benjamin";
        we = new Integer[] {4, 2, 1, 4, 3, 1, 2};
        assertEquals("Not enough participants", Rank.nthRank(st, we, 8));

        st = "Addison,Jayden,Sofia,Michael,Andrew,Lily,Benjamin";
        we = new Integer[] {4, 2, 1, 4, 3, 1, 2};
        assertEquals("Benjamin", Rank.nthRank(st, we, 4));

        st = "Elijah,Chloe,Elizabeth,Matthew,Natalie,Jayden";
        we = new Integer[] {1, 3, 5, 5, 3, 6};
        assertEquals("Matthew", Rank.nthRank(st, we, 2));

        st = "COLIN,AMANDBA,AMANDAB,CAROL,PauL,JOSEPH";
        we = new Integer[] {1, 4, 4, 5, 2, 1};
        assertEquals("PauL", Rank.nthRank(st, we, 4));
    }


    @Test(dataProvider = "names")
    public void shouldReturnSumOfLetterPositionsInAlphabet(String name, int expectedSum) {
        //when
        int actualSum = Rank.getSumOfLetters(name);

        //then
        Assert.assertEquals(actualSum, expectedSum);
    }

    @DataProvider
    public static Object[][] names() {
        return new Object[][]{
                {"addison", 66},
                {"jayden", 59},
                {"sofia", 50},
                {"andrew", 65},
                {"michael", 51},
                {"lily", 58},
                {"benjamin", 68},
                {"elizabeth", 88},
                {"natalie", 62},
                {"jayden", 59},
                {"chloe", 43},
        };
    }

    @Test(dataProvider = "namesAndPositions")
    public void shouldReturnWinningNumberForTheName(String name, int position, int expectedSum) {
        //when
        int actualSum = Rank.winningNumber(name, position);

        //then
        Assert.assertEquals(actualSum, expectedSum);
    }

    @DataProvider
    public static Object[][] namesAndPositions() {
        return new Object[][]{
                {"addison", 2, 146},
                {"jayden", 4, 260},
                {"sofia", 5, 275},
                {"andrew", 3, 213},
                {"michael", 1, 58},
                {"lily", 3, 186},
                {"benjamin", 3, 228},
                {"elizabeth", 4, 388},
                {"natalie", 5, 345},
                {"jayden", 1, 65},
                {"chloe", 2, 96},
        };
    }
}