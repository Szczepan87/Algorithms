package AlgorytmyCwiczenia.ArraysExc;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonalRecordTest {

    @Test
    public void name() {
        assertArrayEquals(new int[]{4,0}, PersonalRecord.breakingRecords(new int[]{3, 4, 21, 36, 10, 28, 35, 5,24, 42}));
    }

    @Test
    public void name2() {
        assertArrayEquals(new int[]{2,4}, PersonalRecord.breakingRecords(new int[]{10, 5, 20, 20, 4, 5, 2, 25, 1}));
    }
}