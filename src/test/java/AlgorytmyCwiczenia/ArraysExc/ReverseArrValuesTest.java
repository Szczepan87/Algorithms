package AlgorytmyCwiczenia.ArraysExc;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseArrValuesTest {

    @Test
    public void reversedValuesTest() {
        int[] original = new int[]{-5, 10, -8, -15, 20, 25, 14, -9};
        int[] result = new int[]{5, -10, 8, 15, -20, -25, -14, 9};
        assertArrayEquals(result, ReverseArrValues.reveseValueOf(original));
    }
}