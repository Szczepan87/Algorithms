package AlgorytmyCwiczenia;

import org.junit.Test;

import static org.junit.Assert.*;

public class SequenceSumTest {

    @Test
    public void testBasic() {
        assertEquals("0+1+2+3+4+5+6 = 21",SequenceSum.showSequence(6));
    }

    @Test
    public void testBelowZero() {
        assertEquals("-15<0",SequenceSum.showSequence(-15));
    }

    @Test
    public void testZero() {
        assertEquals("0=0",SequenceSum.showSequence(0));
    }

}