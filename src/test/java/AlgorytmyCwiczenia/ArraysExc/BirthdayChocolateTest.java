package AlgorytmyCwiczenia.ArraysExc;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class BirthdayChocolateTest {

    @Test
    public void name() {
        List<Integer> list = Arrays.asList(2,2,1,3,2);
        assertEquals(2, BirthdayChocolate.birthday(list,4,2));
    }

    @Test
    public void name1() {
        List<Integer> list = Arrays.asList(1, 2, 1, 3, 2);
        assertEquals(2, BirthdayChocolate.birthday(list,3,2));
    }

    @Test
    public void name2() {
        List<Integer> list = Arrays.asList(1, 1, 1, 1, 1, 1);
        assertEquals(0, BirthdayChocolate.birthday(list,3,2));
    }

    @Test
    public void name3() {
        List<Integer> list = Arrays.asList(4);
        assertEquals(1, BirthdayChocolate.birthday(list,4,1));
    }
}