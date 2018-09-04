package AlgorytmyCwiczenia;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExcerciseTest {

    Exercise excercise = new Exercise();

    Point[] points = new Point[3];

    @Test
    public void test() throws Exception {
        points[0] = new Point(2,1);
        points[1] = new Point(1,1);
        points[2] = new Point(3,3);
        assertTrue(excercise.arePointsDifferent(points));
    }

    @Test (expected = SizeException.class)
    public void test2() throws Exception {
        points[0] = new Point(2000000000,1);
        points[1] = new Point(1,1);
        points[2] = new Point(3,3);
        assertTrue(excercise.arePointsDifferent(points));
    }
}