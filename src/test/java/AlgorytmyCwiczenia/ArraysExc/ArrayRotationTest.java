package AlgorytmyCwiczenia.ArraysExc;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayRotationTest {

    @Test
    public void fourByFourArrayTest() {
        int[][] testArr = new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        int[][] resultArr = new int[][]{
                {2,3,4,8},
                {1,7,11,12,},
                {5,6,10,16},
                {9,13,14,15}};
        System.out.println(testArr.length);
        assertArrayEquals(resultArr,ArrayRotation.leftCircularRotation(1, testArr));
    }
}