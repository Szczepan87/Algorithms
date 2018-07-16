package AlgorytmyCwiczenia.ArraysExc;

import org.junit.Test;

import static org.junit.Assert.*;

public class SeriesOfNumbersTest {

    @Test
    public void standardTest() {
        int[] test1 = new int[]{1,5,9,2,5,8,4,5,6,1,2,4,7,8};
        int[] test2 = new int[]{4,5,6,2,8,5,4,8,5,1,2,5,5};
        int[] result = new int[]{4,5,6,1,2};
        for (int i = 0; i < SeriesOfNumbers.findCommon(test1, test2).length; i++) {
            System.out.print(i+", ");
        }
        assertArrayEquals(result, SeriesOfNumbers.findCommon(test1, test2));
    }

    @Test
    public void emptyArrTest() {
        int[] test1 = new int[]{};
        int[] test2 = new int[]{4,5,6,2,8,5,4,8,5,1,2,5,5};
        int[] result =new int[]{};
        assertArrayEquals(result,SeriesOfNumbers.findCommon(test1,test2));
    }

    @Test
    public void noCommonSeries() {
        int[] test1 = new int[]{1,1,1,1,1};
        int[] test2 = new int[]{4,5,6,2,8,5,4,8,5,1,2,5,5};
        int[] result = new int[]{};
        assertArrayEquals(result,SeriesOfNumbers.findCommon(test1,test2));
    }
}