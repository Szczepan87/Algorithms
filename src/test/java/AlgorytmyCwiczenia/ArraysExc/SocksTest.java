package AlgorytmyCwiczenia.ArraysExc;

import org.junit.Test;

import static org.junit.Assert.*;

public class SocksTest {

    private Socks socks = new Socks();

    @Test
    public void findSomePairsTest() {
        assertEquals(3, socks.sockMerchant(7,new int[]{2,2,3,1,1,2,3}));
    }
}