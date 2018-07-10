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

    @Test
    public void testFor2012() {
        assertEquals("MMXII",RomanNumber.fromArabic(2012));
    }

    @Test
    public void testFor40() {
        assertEquals("XL",RomanNumber.fromArabic(40));
    }

    @Test
    public void testFor60() {
        assertEquals("LX",RomanNumber.fromArabic(60));
    }

    @Test
    public void testFor95() {
        assertEquals("XCV",RomanNumber.fromArabic(95));
    }

    @Test
    public void testFor3888() {
        assertEquals("MMMDCCCLXXXVIII",RomanNumber.fromArabic(3888));
    }


}