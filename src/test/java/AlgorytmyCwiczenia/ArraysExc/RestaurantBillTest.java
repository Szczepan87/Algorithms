package AlgorytmyCwiczenia.ArraysExc;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class RestaurantBillTest {

    private List<Integer> firstList = Arrays.asList(3, 10, 2, 9);

    @Test
    public void name() {
        assertEquals("5",RestaurantBill.bonAppetit(firstList,1,12));
    }
}