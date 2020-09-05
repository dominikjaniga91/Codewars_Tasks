package _5kyu.trailingZeros;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SolutionTest {

    @Test
    public void testZeros() throws Exception {
        assertThat(Solution.zeros(0), is(0));
        assertThat(Solution.zeros(6), is(1));
        assertThat(Solution.zeros(12), is(2));
        assertThat(Solution.zeros(14), is(2));

    }
}
