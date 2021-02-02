package _8kyu.wronghead;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WrongEndHeadTest {

    @Test(dataProvider = "arrays")
    public void exampleTest1(String[] expected, String[] data) {

        String[] actual = WrongEndHead.fixTheMeerkat(data);

        assertEquals(actual, expected);
    }

    @DataProvider
    private Object[][] arrays() {
        return new Object[][]{
                {new String[]{ "sky", "rainbow", "ground" }, new String[]{ "ground", "rainbow", "sky" }},
                {new String[]{ "upper legs", "torso", "lower legs" }, new String[]{ "lower legs", "torso", "upper legs" }},
                {new String[]{ "top", "middle", "bottom" }, new String[]{ "bottom", "middle", "top" }},
                {new String[]{ "heads", "body", "tails" }, new String[]{ "tails", "body", "heads" }},
                {new String[]{ "head", "body", "tail" }, new String[]{ "tail", "body", "head" }}};
    }
}
