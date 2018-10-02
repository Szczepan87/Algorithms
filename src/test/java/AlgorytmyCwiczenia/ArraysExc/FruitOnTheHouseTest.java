package AlgorytmyCwiczenia.ArraysExc;

import org.junit.Test;

import static org.junit.Assert.*;

public class FruitOnTheHouseTest {

    @Test
    public void name() {
        assertArrayEquals(new int[]{1,1}, FruitOnTheHouse.countApplesAndOranges(7, 11, 5, 15, new int[]{-2, 2, 1}, new int[]{5, -6}));
    }

    @Test
    public void name2() {
        assertArrayEquals(new int[]{1,1}, FruitOnTheHouse.countApplesAndOranges(2, 3, 1, 5, new int[]{2}, new int[]{-2}));
    }
}