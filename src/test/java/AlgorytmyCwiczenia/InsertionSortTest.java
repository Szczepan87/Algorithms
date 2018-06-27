package AlgorytmyCwiczenia;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {

    @Test
    public void insertSort() {
        int[] genericArr = new int[]{-25,25,16,-8,0,4,13,0,5};
        int[] sortedArr = new int[]{-25,-8,0,0,4,5,13,16,25};
        InsertionSort insertionSort = new InsertionSort();
        assertArrayEquals(sortedArr, insertionSort.insertSort(genericArr));
    }
}