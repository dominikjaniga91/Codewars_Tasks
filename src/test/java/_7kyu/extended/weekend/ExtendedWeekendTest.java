package _7kyu.extended.weekend;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class ExtendedWeekendTest {


    @Test
    public void basicTests(){
        assertArrayEquals(new String[]{"JANUARY","MAY","5"}, ExtendedWeekend.solve(2016,2020));
        assertArrayEquals(new String[]{"MARCH", "DECEMBER","51"}, ExtendedWeekend.solve(1900,1950));
        assertArrayEquals(new String[]{"AUGUST", "OCTOBER","702"}, ExtendedWeekend.solve(1800,2500));
    }

}
