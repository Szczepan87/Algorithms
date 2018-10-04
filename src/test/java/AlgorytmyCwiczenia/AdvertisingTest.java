package AlgorytmyCwiczenia;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdvertisingTest {

    @Test
    public void name() {
        assertEquals(9, Advertising.viralAdvertising(3));
    }

    @Test
    public void name2() {
        assertEquals(24, Advertising.viralAdvertising(5));
    }
}