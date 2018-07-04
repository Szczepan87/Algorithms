package AlgorytmyCwiczenia.ArraysExc;

import org.junit.Test;

import static org.junit.Assert.*;

public class VacationTest {

    @Test
    public void testStandard() {
        int[] trip = new int[]{1,1,4,5,3,2,5};
        assertEquals(4,Vacation.shortTrip(trip));
    }

    @Test
    public void testSame() {
        int[] trip = new int[]{1,1,1,1,1,1,1};
        assertEquals(1,Vacation.shortTrip(trip));
    }

    @Test
    public void testEmpty() {
        int[] trip = new int[]{};
        assertEquals(0,Vacation.shortTrip(trip));
    }

    @Test
    public void testShort() {
        int[] trip = new int[]{1,2,3};
        assertEquals(3,Vacation.shortTrip(trip));
    }

    @Test
    public void testLongInterval() {
        int[] trip = new int[]{1,2,3,3,3,3,4,5,8,7,6};
        assertEquals(trip.length, Vacation.shortTrip(trip));
    }
}