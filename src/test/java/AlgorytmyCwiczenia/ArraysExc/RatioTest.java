package AlgorytmyCwiczenia.ArraysExc;

import org.junit.Test;

import static org.junit.Assert.*;

public class RatioTest {

    @Test
    public void test1() {
        assertEquals("0.400000\n" +"0.400000\n" + "0.200000", Ratio.plusMinus(new int[]{1,1,0,-1,-1}));
    }

    @Test
    public void test2() {
        assertEquals("0.500000\n" + "0.333333\n" +
                "0.166667", Ratio.plusMinus(new int[]{-4, 3, -9, 0, 4, 1}));
    }
}