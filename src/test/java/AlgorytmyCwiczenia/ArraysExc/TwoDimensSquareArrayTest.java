package AlgorytmyCwiczenia.ArraysExc;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoDimensSquareArrayTest {

    @Test
    public void sample1() {
        int[][] testArray = new int[][]{{1,2,3},{4,5,6},{9,8,9}};
        assertEquals(2, TwoDimensSquareArray.diagonalDifference(testArray));
    }

    @Test
    public void sample2() {
        int[][] testArray = new int[][]{{11,2,4},{4,5,6},{10,8,-12}};
        assertEquals(15, TwoDimensSquareArray.diagonalDifference(testArray));
    }
}