package AlgorytmyCwiczenia.ArraysExc;

import org.junit.Test;

import static org.junit.Assert.*;

public class OrderedSequenceTest {

    /**Znajduje sekwencje kolejnych liczb w tablicy i zwraca je w nowej tablicy.*/
    @Test
    public void findFor() {
        int[] genericArr = new int[]{1,2,3,8,10,12,13,13,14,15,20,25,25};
        int[] resultArr = new int[]{1,2,3,12,13,14,15};
        OrderedSequence orderedSequence = new OrderedSequence();
        assertArrayEquals(resultArr, orderedSequence.findFor(genericArr));
    }
}