package AlgorytmyCwiczenia;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleAlgorithmTest {

    @Test
    public void absoluteNegativeTest() {
        assertEquals(5, SimpleAlgorithm.absoluteValue(-5), 0.001);
    }

    @Test
    public void absolutePositiveTest() {
        assertEquals(5, SimpleAlgorithm.absoluteValue(5), 0.001);
    }

    @Test
    public void sumOfArrTest() {
        double[] array = new double[]{25, 5, -5, 25};
        assertEquals(50, SimpleAlgorithm.sumOfArrElements(array), 0.001);
    }

    @Test
    public void findMinArrElementTest() {
        double[] array = new double[]{25, 5, -5, 25};
        assertEquals(-5, SimpleAlgorithm.findMinArrElement(array), 0.001);
    }

    @Test
    public void findMaxArrElementTest() {
        double[] array = new double[]{25, 5, -5, 25};
        assertEquals(-5, SimpleAlgorithm.findMaxArrElement(array), 0.001);
    }

    @Test
    public void CountElementOfArrayTest() {
        double[] array = new double[]{25, 5, -5, 25};
        assertEquals(2, SimpleAlgorithm.countElementOfArray(25, array), 0.001);
    }

    @Test
    public void searchInArrForTest() {
        double[] array = new double[]{25, 5, -5, 25};
        assertTrue(SimpleAlgorithm.searchInArrFor(25, array));
    }

    @Test
    public void searchInArrForNonExistentTest() {
        double[] array = new double[]{25, 5, -5, 25};
        assertFalse(SimpleAlgorithm.searchInArrFor(-6, array));
    }

    @Test
    public void binarySearchTest() {
        double[] array = new double[]{25, 5, -5, 0, 25};
        assertTrue(SimpleAlgorithm.binarySearch(5, array, 0, array.length));
    }

    @Test
    public void binarySearchForNonExistentTest() {
        double[] array = new double[]{25, 5, -5, 0, 25};
        assertFalse(SimpleAlgorithm.binarySearch(-18, array, 0, array.length));
    }

    @Test
    public void binarySearchForGraterThanHalfTest() {
        double[] array = new double[]{25, 5, -5, 0, 25};
        assertTrue(SimpleAlgorithm.binarySearch(0, array, 0, array.length));
    }

    @Test
    public void binarySearchForLessThanHalfTest() {
        double[] array = new double[]{25, 5, -5, 0, 25};
        assertTrue(SimpleAlgorithm.binarySearch(5, array, 0, array.length));
    }
}