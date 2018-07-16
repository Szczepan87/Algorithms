package AlgorytmyCwiczenia.ArraysExc;

import org.junit.Test;

import static org.junit.Assert.*;

public class FrequencyTest {

    @Test
    public void testFor2() {
        assertEquals(2, Frequency.mostFrequentItemCount(new int[] {3, -1, -1}));
    }

    @Test
    public void testFor5() {
        assertEquals(5, Frequency.mostFrequentItemCount(new int[] {3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3}));
    }

    @Test
    public void testFor0() {
        assertEquals(0, Frequency.mostFrequentItemCount(new int[0]));
    }

    @Test
    public void testFor1() {
        assertEquals(1, Frequency.mostFrequentItemCount(new int[] {-1, 2, 3, 4, 9}));
    }
}