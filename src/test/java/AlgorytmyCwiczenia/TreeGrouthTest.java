package AlgorytmyCwiczenia;

import org.junit.Test;

import static org.junit.Assert.*;

public class TreeGrouthTest {

    @Test
    public void name() {
        assertEquals(1, TreeGrowth.utopianTree(0));
        assertEquals(2, TreeGrowth.utopianTree(1));
    }

    @Test
    public void name1() {
        assertEquals(7, TreeGrowth.utopianTree(4));
    }

    @Test
    public void name2() {
        assertEquals(6, TreeGrowth.utopianTree(3));
    }
}