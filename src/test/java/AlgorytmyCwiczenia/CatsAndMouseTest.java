package AlgorytmyCwiczenia;

import org.junit.Test;

import static org.junit.Assert.*;

public class CatsAndMouseTest {

    @Test
    public void name() {
        assertEquals("Cat B", CatsAndMouse.catAndMouse(1,2,3));
    }

    @Test
    public void name1() {
        assertEquals("Mouse C", CatsAndMouse.catAndMouse(1,3,2));
    }
}