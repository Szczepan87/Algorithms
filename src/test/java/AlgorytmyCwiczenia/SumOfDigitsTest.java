package AlgorytmyCwiczenia;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfDigitsTest {

    @Test
    public void tests16() {
        assertEquals( "Nope!" , 7, SumOfDigits.digital_root(16));
    }

    @Test
    public void test942() {
        assertEquals( "Nope!" , 6, SumOfDigits.digital_root(942));
    }

    @Test
    public void test132189() {
        assertEquals( "Nope!" , 6, SumOfDigits.digital_root(132189));
    }

    @Test
    public void test493193() {
        assertEquals( "Nope!" , 2, SumOfDigits.digital_root(493193));
    }
}