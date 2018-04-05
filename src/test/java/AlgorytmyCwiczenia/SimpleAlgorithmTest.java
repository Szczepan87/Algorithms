package AlgorytmyCwiczenia;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleAlgorithmTest {

    @Test
    public void absoluteNegativeTest() {
        assertEquals(5, SimpleAlgorithm.absoluteValue(-5),0.001);
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

    public void testCountElementOfArray() {
        double[] array = new double[]{25, 5, -5, 25};
        assertEquals(2, SimpleAlgorithm.countElementOfArray(25, array), 0.001);
    }
}