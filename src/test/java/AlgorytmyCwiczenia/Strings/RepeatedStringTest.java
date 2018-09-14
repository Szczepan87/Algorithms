package AlgorytmyCwiczenia.Strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedStringTest {

    private RepeatedString repeatedString = new RepeatedString();

    @Test
    public void test1() {
        assertEquals(7, repeatedString.repeatedString(10, "aba"),0.01);
    }

    @Test
    public void test2() {
        assertEquals(4, repeatedString.repeatedString(10, "abcac"),0.01);
    }

//    @Test
//    public void test3() {
//        assertEquals( 1000000000000, repeatedString.repeatedString(1000000000000, "a"));
//    }
}