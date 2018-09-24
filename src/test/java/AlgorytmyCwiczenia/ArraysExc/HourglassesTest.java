package AlgorytmyCwiczenia.ArraysExc;

import org.junit.Test;

import static org.junit.Assert.*;

public class HourglassesTest {

    @Test
    public void name1() {
        assertEquals(19, Hourglasses.hourglassSum(new int[][]{{1, 1, 1, 0, 0, 0,},{0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}}));
    }
}