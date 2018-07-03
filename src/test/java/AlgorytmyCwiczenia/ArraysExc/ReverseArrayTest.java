package AlgorytmyCwiczenia.ArraysExc;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseArrayTest {

    @Test
    public void notUsingLoop() {
        int[] toReverse = new int[]{5, 10, -1, 52, -300, 0, 12};
        int[] expected = new int[]{12, 0, -300, 52, -1, 10, 5};
        assertArrayEquals(expected,ReverseArray.notUsingLoop(toReverse));
    }
}