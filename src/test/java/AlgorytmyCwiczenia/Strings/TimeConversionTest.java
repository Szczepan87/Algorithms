package AlgorytmyCwiczenia.Strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class TimeConversionTest {

    @Test
    public void name() {
        assertEquals("19:05:45", TimeConversion.timeConversion("07:05:45PM"));
    }
}