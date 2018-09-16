package AlgorytmyCwiczenia.ArraysExc;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TripletTest {

    private Triplet triplet = new Triplet();

    private List<Integer> list1 = Arrays.asList(5,6,7);
    private List<Integer> list2 = Arrays.asList(3,6,10);
    private List<Integer> list3 = Arrays.asList(17,28,30);
    private List<Integer> list4 = Arrays.asList(99,16,8);
    private List<Integer> result1 = Arrays.asList(1,1);
    private List<Integer> result2 = Arrays.asList(2,1);

    @Test
    public void test1() {
        assertEquals(result1, triplet.compareTriplets(list1, list2));
    }

    @Test
    public void test2() {
        assertEquals(result2, triplet.compareTriplets(list3, list4));
    }
}