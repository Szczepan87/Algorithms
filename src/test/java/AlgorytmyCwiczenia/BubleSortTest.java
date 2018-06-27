package AlgorytmyCwiczenia;

import org.junit.Test;

import static org.junit.Assert.*;

public class BubleSortTest {

    @Test
    public void sortArr() {
        int[] genericArr = new int[]{-25,25,16,-8,0,4,13,0,5};
        int[] sortedArr = new int[]{-25,-8,0,0,4,5,13,16,25};
        BubleSort bubleSort = new BubleSort();
        assertArrayEquals(sortedArr, bubleSort.sortArr(genericArr));
    }
}