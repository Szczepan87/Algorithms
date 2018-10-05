package AlgorytmyCwiczenia.ArraysExc;

import org.junit.Test;

import static org.junit.Assert.*;

public class HurdleTest {

    @Test
    public void name() {
        assertEquals(2,Hurdle.hurdleRace(4, new int[]{1, 6, 3, 5, 2}));
    }

    @Test
    public void name2() {
        assertEquals(2,Hurdle.hurdleRace(1, new int[]{1,2,3,3,2}));
    }

    @Test
    public void name3() {
        assertEquals(0,Hurdle.hurdleRace(7, new int[]{2, 5, 4, 5, 2}));
    }
}