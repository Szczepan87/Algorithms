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
    public void testFor3() {
        assertEquals(3, Frequency.mostFrequentItemCount(new int[] {10, 6, -5, -13, 2, -7, -11, -10, -13, -2, -6, 6, -14, -15, -15, -8, 13, 9, -11, -15, 10, -5, -1, -3, -14, 12, 11, 13}));
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