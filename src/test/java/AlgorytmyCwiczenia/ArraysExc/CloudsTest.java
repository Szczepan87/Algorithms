package AlgorytmyCwiczenia.ArraysExc;

import org.junit.Test;

import static org.junit.Assert.*;

public class CloudsTest {

    private Clouds clouds = new Clouds();

    @Test
    public void jumpingCloudsTest() {
        assertEquals(3, clouds.jumpingOnClouds(new int[]{0, 1, 0, 0, 0, 1, 0}));
    }

    @Test
    public void jumpingCloudsTest2() {
        assertEquals(3, clouds.jumpingOnClouds(new int[]{0, 0, 0, 0, 1, 0}));
    }

    @Test
    public void jumpingCloudsTest3() {
        assertEquals(4, clouds.jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 0}));
    }

    @Test
    public void name() {
        assertEquals(92, Clouds.jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 1, 0}, 2));
    }
}