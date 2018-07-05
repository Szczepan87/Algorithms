package AlgorytmyCwiczenia.ArraysExc;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseArrayTest {

    @Test
    public void notUsingLoop() {
        ReverseArray reverseArray = new ReverseArray();
        int[] toReverse = new int[]{5, 10, -1, 52, -300, 0, 12};
        int[] expected = new int[]{12, 0, -300, 52, -1, 10, 5};
        assertArrayEquals(expected,reverseArray.notUsingLoop(toReverse));
    }

    @Test
    public void notUsingLoop2() {
        ReverseArray reverseArray = new ReverseArray();
        int[] toReverse = new int[]{0,1};
        int[] expected = new int[]{1,0};
        assertArrayEquals(expected,reverseArray.notUsingLoop(toReverse));
    }

    @Test
    public void notUsingLoop3() {
        ReverseArray reverseArray = new ReverseArray();
        int[] toReverse = new int[]{};
        int[] expected = new int[]{};
        assertArrayEquals(expected,reverseArray.notUsingLoop(toReverse));
    }

    @Test
    public void notUsingLoop4() {
        ReverseArray reverseArray = new ReverseArray();
        int[] toReverse = new int[]{1};
        int[] expected = new int[]{1};
        assertArrayEquals(expected,reverseArray.notUsingLoop(toReverse));
    }
}