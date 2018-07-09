package AlgorytmyCwiczenia.Strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumberTest {

    @Test
    public void MMXIItest() {
        assertEquals(2012,RomanNumber.toArabic("MMXII"));
    }

    @Test
    public void XLtest() {
        assertEquals(40,RomanNumber.toArabic("XL"));
    }

    @Test
    public void LXtest() {
        assertEquals(60,RomanNumber.toArabic("LX"));
    }

    @Test
    public void XCVtest() {
        assertEquals(95,RomanNumber.toArabic("XCV"));
    }

    @Test
    public void MMMDCCCLXXXVIIItest() {
        assertEquals(3888,RomanNumber.toArabic("MMMDCCCLXXXVIII"));
    }
}