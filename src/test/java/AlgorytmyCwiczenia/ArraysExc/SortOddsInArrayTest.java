package AlgorytmyCwiczenia.ArraysExc;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.runners.JUnit4;

public class SortOddsInArrayTest {

    @Test
    public void exampleTest1() {
        assertArrayEquals(new int[]{1, 3, 2, 8, 5, 4}, SortOddsInArray.sortArray(new int[]{5, 3, 2, 8, 1, 4}));
    }

    @Test
    public void exampleTest2() {
        assertArrayEquals(new int[]{1, 3, 5, 8, 0}, SortOddsInArray.sortArray(new int[]{5, 3, 1, 8, 0}));
    }

    @Test
    public void exampleTest3() {
        assertArrayEquals(new int[]{}, SortOddsInArray.sortArray(new int[]{}));
    }

    @Test
    public void allEvenInArr() {
        assertArrayEquals(new int[]{2, 4, 6, 8, 0}, SortOddsInArray.sortArray(new int[]{2, 4, 6, 8, 0}));
    }

    @Test
    public void allSameOddsInArr() {
        assertArrayEquals(new int[]{3, 3, 3, 3, 3}, SortOddsInArray.sortArray(new int[]{3, 3, 3, 3, 3}));
    }
}