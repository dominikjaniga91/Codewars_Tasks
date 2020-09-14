package _6kyu.stringArrayDuplicates;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class SolutionTest{
    @Test
    public void basicTests(){
        assertArrayEquals(new String[]{"codewars","picaniny","hubububo"},Solution.removeDuplicates(new String[]{"ccooddddddewwwaaaaarrrrsssss","piccaninny","hubbubbubboo"}));
        assertArrayEquals(new String[]{"abracadabra","alote","asese"},Solution.removeDuplicates(new String[]{"abracadabra","allottee","assessee"}));
        assertArrayEquals(new String[]{"keles","kenes"},Solution.removeDuplicates(new String[]{"kelless","keenness"}));
    }
}
