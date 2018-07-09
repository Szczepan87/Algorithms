package AlgorytmyCwiczenia;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SumDigPowerTest {

    private static void testing(long a, long b, long[] res) {
        assertEquals(Arrays.toString(res),
                Arrays.toString(SumDigPower.sumDigPow(a, b).toArray()));
    }

    @Test
    public void oneToTenTest() {
        testing(1, 10, new long[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
    }

    @Test
    public void oneToHundredTest() {
        testing(1, 100, new long[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 89});
    }

    @Test
    public void tenToHundredTest() {
        testing(10, 100,  new long[] {89});
    }

    @Test
    public void noResultTest() {
        testing(90, 100, new long[] {});
    }

    @Test
    public void ninetyTo150Test() {
        testing(90, 150, new long[] {135});
    }

    @Test
    public void fiftyTo150Test() {
        testing(50, 150, new long[] {89, 135});
    }

    @Test
    public void tenTo150Test() {
        testing(10, 150, new long[] {89, 135});
    }
}