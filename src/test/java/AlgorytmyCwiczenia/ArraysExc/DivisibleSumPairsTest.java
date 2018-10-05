package AlgorytmyCwiczenia.ArraysExc;

import org.junit.Test;

import static org.junit.Assert.*;

public class DivisibleSumPairsTest {

    @Test
    public void name() {
        assertEquals(3, DivisibleSumPairs.divisibleSumPairs(6,5, new int[]{1,2,3,4,5,6}));
    }

    @Test
    public void name1() {
        assertEquals(5, DivisibleSumPairs.divisibleSumPairs(6,3, new int[]{1, 3, 2, 6, 1, 2}));
    }
}