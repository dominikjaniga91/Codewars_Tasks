package _7kyu.regex.validate.code;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SolutionTest {

    @ParameterizedTest
    @DisplayName("{0} should give result: {1}")
    @CsvFileSource(resources = "/regex_validate_code_data.csv")
    void shouldReturnTruOfFalse(String pin, boolean expected) {

        boolean actual = Solution.validatePin(pin);
        Assertions.assertEquals(expected, actual);
    }
}
