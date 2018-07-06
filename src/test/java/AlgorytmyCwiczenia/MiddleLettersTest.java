package AlgorytmyCwiczenia;

import org.junit.Test;

import static org.junit.Assert.*;

public class MiddleLettersTest {
    @Test
    public void testTest() {
        assertEquals("es", MiddleLetters.getMiddle("test"));
    }

    @Test
    public void middleTest() {
        assertEquals("dd", MiddleLetters.getMiddle("middle"));

    }

    @Test
    public void oddTests() {
        assertEquals("t", MiddleLetters.getMiddle("testing"));
    }

    @Test
    public void aTest() {
        assertEquals("A", MiddleLetters.getMiddle("A"));

    }
}