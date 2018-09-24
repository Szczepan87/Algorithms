package AlgorytmyCwiczenia.ArraysExc;

import org.junit.Test;

import static org.junit.Assert.*;

public class EqualizeTest {

    @Test
    public void name() {
        assertEquals(2, Equalize.equalizeArray(new int[]{3, 3, 1, 2, 3}));
    }

    @Test
    public void name2() {
        assertEquals(4, Equalize.equalizeArray(new int[]{3, 3, 1, 2, 3, 3, 1, 1}));
    }

    @Test
    public void name3() {
        assertEquals(5, Equalize.equalizeArray(new int[]{1, 2, 3, 4, 5, 6}));
    }

    @Test
    public void name4() {
        assertEquals(63, Equalize.equalizeArray(new int[]{24, 29, 70, 43, 12, 27, 29, 24, 41, 12, 41, 43, 24,
                70, 24, 100, 41, 43, 43, 100, 29, 70, 100, 43, 41, 27, 70, 70, 59, 41, 24, 24, 29, 43, 24, 27, 70, 24,
                27, 70, 24, 70, 27, 24, 43, 27, 100, 41, 12, 70, 43, 70, 62, 12, 59, 29, 62, 41, 100, 43, 43, 59, 59,
                70, 12, 27, 43, 43, 27, 27, 27, 24, 43, 43, 62, 43, 70, 29}));
    }
}