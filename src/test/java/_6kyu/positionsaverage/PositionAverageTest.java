package _6kyu.positionsaverage;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Offset;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PositionAverageTest {

    @Test(dataProvider = "data")
    public void posAverage_returnAppropriatePercentage_forGivenStringWithCommonPosition(String words, double result) {
        //when
        double actual = PositionAverage.posAverage(words);

        //then
        Assertions.assertThat(actual)
                .as("Percentage should be the same")
                .isCloseTo(result, Offset.offset(0.0000000001));
    }

    @DataProvider
    private Object[][] data() {
        return new Object[][] {
                {"466960, 069060, 494940, 060069, 060090, 640009, 496464, 606900, 004000, 944096", 26.6666666667},
                {"444996, 699990, 666690, 096904, 600644, 640646, 606469, 409694, 666094, 606490", 29.2592592593},
                {"4444444, 4444444, 4444444, 4444444, 4444444, 4444444, 4444444, 4444444", 100},
                {"0, 0, 0, 0, 0, 0, 0, 0", 100}
        };
    }
}