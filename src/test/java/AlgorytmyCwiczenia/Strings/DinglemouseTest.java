package AlgorytmyCwiczenia.Strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class DinglemouseTest {

    @Test
    public void test1200() {
        assertEquals("12:00", Dinglemouse.whatTimeIsIt(0));
        assertEquals("12:00", Dinglemouse.whatTimeIsIt(360));
    }

    @Test
    public void test0300() {
        assertEquals("03:00", Dinglemouse.whatTimeIsIt(90));
    }

    @Test
    public void test0600() {
        assertEquals("06:00", Dinglemouse.whatTimeIsIt(180));
    }

    @Test
    public void test0900() {
        assertEquals("09:00", Dinglemouse.whatTimeIsIt(270));
    }

    @Test
    public void test0924() {
        assertEquals("09:24", Dinglemouse.whatTimeIsIt(282.256));
    }

    @Test
    public void test0531() {
        assertEquals("05:31", Dinglemouse.whatTimeIsIt(165.748));
    }


}