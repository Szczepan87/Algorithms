package AlgorytmyCwiczenia.Strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class CaseTest {

    @Test
    public void testSomething() {
        assertEquals("", Case.alternateCase(""));
        assertEquals("ABC", Case.alternateCase("abc"));
        assertEquals("abc", Case.alternateCase("ABC"));
        assertEquals("hELLO wORLD!", Case.alternateCase("Hello World!"));
    }
}