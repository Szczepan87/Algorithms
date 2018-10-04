package AlgorytmyCwiczenia.ArraysExc;

import org.junit.Test;

import static org.junit.Assert.*;

public class BetweenTwoSetsTest {

    @Test
    public void name() {
        assertEquals(3, BetweenTwoSets.getTotalX(new int[]{2,4},new int[]{16,32,96}));
    }

    @Test
    public void name2() {
        assertEquals(2, BetweenTwoSets.getTotalX(new int[]{2,6},new int[]{24,36}));
    }
}