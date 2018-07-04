package AlgorytmyCwiczenia.ArraysExc;

import org.junit.Test;

import static org.junit.Assert.*;

public class HummerTest {

    @Test
    public void testForZeroHits() {
        int[] test = new int[]{1,2,3,4,5,6};
        assertEquals(1, Hummer.nailed(test,0));
    }

    @Test
    public void testForOneHigherAsc2() {
        int[] test = new int[]{1,2,3,4,5,6};
        assertEquals(3, Hummer.nailed(test,2));
    }

    @Test
    public void testForNokia() {
        int[] test = new int[]{1,2,2,3,3,3,4,4,5,5};
        assertEquals(5, Hummer.nailed(test,2));
    }

    @Test
    public void testForEmptyArr() {
        int[] test = new int[]{};
        assertEquals(0, Hummer.nailed(test,0));
    }

    @Test
    public void testForEmptyArrWithHits() {
        int[] test = new int[]{};
        assertEquals(0, Hummer.nailed(test,2));
    }
}