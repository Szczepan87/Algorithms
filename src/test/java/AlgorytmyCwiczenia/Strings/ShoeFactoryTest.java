package AlgorytmyCwiczenia.Strings;

import AlgorytmyCwiczenia.Strings.ShoeFactory;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShoeFactoryTest {

    @Test
    public void gapTest() {
        assertEquals(4,ShoeFactory.gap("RLLRLLLRLRRRLR"));
    }

    @Test
    public void gapTest1() {
        assertEquals(0,ShoeFactory.gap("RLRLRLRLRLRLRLRL"));
    }

    @Test
    public void gapTest2() {
        assertEquals(0,ShoeFactory.gap(""));
    }

    @Test
    public void gapTest3() {
        assertEquals(2,ShoeFactory.gap("LLRLRLRLRLRR"));
    }
}