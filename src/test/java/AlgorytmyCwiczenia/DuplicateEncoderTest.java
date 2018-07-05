package AlgorytmyCwiczenia;

import org.junit.Test;

import static org.junit.Assert.*;

public class DuplicateEncoderTest {

    @Test
    public void spacesTest() {
        assertEquals("))))())))", DuplicateEncoder.encode("   ()(   "));
    }

    @Test
    public void shortAllDiff() {
        assertEquals("(((", DuplicateEncoder.encode("din"));
    }

    @Test
    public void almostEveryOtherSameLong() {
        assertEquals(")()())()(()()(", DuplicateEncoder.encode("Prespecialized"));
    }

    @Test
    public void everyOtherSameShort() {
        assertEquals("()()()", DuplicateEncoder.encode("recede"));
    }

    @Test
    public void sameLetterNextToEachOther() {
        assertEquals(")())())", DuplicateEncoder.encode("Success"));
    }

    @Test
    public void nonLettersTest() {
        assertEquals("))((", DuplicateEncoder.encode("(( @"));
    }
}