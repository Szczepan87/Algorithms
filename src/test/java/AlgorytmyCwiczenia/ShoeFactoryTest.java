package AlgorytmyCwiczenia;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShoeFactoryTest {

    @Test
    public void gapTest() {
        assertEquals(4,ShoeFactory.gap("RLLRLLLRLRRRLR"));
    }

    @Test
    public void gapTest1() {
        assertEquals(0,ShoeFactory.gap("RLRLRLRLRLRLRLRLR"));
    }

    @Test
    public void gapTest2() {
        assertEquals(0,ShoeFactory.gap(""));
    }

    @Test
    public void gapTest3() {
        assertEquals(1,ShoeFactory.gap("LLRLRLRLRLRR"));
    }
}