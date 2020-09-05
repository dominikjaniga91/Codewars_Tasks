package _6kyu.dubstep;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DubstepTest {


    @Test
    public void Test1() {
        assertEquals("ABC", Dubstep.SongDecoder("WUBWUBABCWUB"));
    }
    @Test
    public void Test2()
    {
        assertEquals("R L", Dubstep.SongDecoder("RWUBWUBWUBLWUB"));
    }


}
