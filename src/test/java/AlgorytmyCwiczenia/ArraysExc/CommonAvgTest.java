package AlgorytmyCwiczenia.ArraysExc;

import org.junit.Test;

import static org.junit.Assert.*;

public class CommonAvgTest {

    private int[] testArr = new int[]{1,1,2,3};

    @Test
    public void findIn() {

        int[] resultArr = new int[]{1,1};
        assertArrayEquals(resultArr, CommonAvg.findIn(testArr));

    }
}