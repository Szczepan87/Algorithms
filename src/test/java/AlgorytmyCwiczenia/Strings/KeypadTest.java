package AlgorytmyCwiczenia.Strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class KeypadTest {

    @Test
    public void simpleTest() {
        assertEquals(9, Keypad.presses("LOL"));
    }

    @Test
    public void simpleTest2() {
        assertEquals(13, Keypad.presses("HOW R U"));
    }
}