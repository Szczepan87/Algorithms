package AlgorytmyCwiczenia.ArraysExc;

import org.junit.Test;

import static org.junit.Assert.*;

public class RotationTest {

    @Test
    public void name() {
        assertArrayEquals(new int[]{5, 1, 2, 3, 4},Rotation.rotLeft(new int[]{1, 2, 3, 4, 5},4));
    }
}