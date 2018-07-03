package AlgorytmyCwiczenia.ArraysExc;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueTest {

    @Test
    public void findNumber() {
        double[] test = new double[]{1,0,3,1,0,1};
        assertEquals(3, Unique.find(test),0.01);
    }

    @Test
    public void findDouble() {
        double[] test = new double[]{1,0,1,1,0,0.33};
        assertEquals(0.33, Unique.find(test),0.01);
    }

    @Test
    public void findMinusDouble() {
        double[] test = new double[]{1,0,-0.11,1,0,1};
        assertEquals(-0.11, Unique.find(test),0.01);
    }



    @Test
    public void findNothingInArr() {
        double[] test = new double[]{1,0,2,3,4,0.33};
        assertEquals(0.0, Unique.find(test),0.01);
    }
}