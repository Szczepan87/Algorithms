package AlgorytmyCwiczenia.WaterDispenser;

import org.junit.Test;

import static org.junit.Assert.*;

public class DispenserTest {

    private Dispenser dispenser;

    @Test
    public void waterTest() {
        dispenser = new Dispenser(new int[]{5,0,0});
        assertEquals("WATER", dispenser.pressStart());
    }

    @Test
    public void lemonTest() {
        dispenser = new Dispenser(new int[]{5,2,0});
        assertEquals("WATER + LEMON", dispenser.pressStart());
    }

    @Test
    public void raspberryTest() {
        dispenser = new Dispenser(new int[]{5,2,1});
        assertEquals("WATER + RASPBERRY", dispenser.pressStart());
    }

    @Test
    public void returnMoneyTest() {
        dispenser = new Dispenser(new int[]{0,0,1});
        assertEquals("MONEY RETURNED!", dispenser.pressStart());
        dispenser = new Dispenser(new int[]{0,0,0});
        assertEquals("MONEY RETURNED!", dispenser.pressStart());
        dispenser = new Dispenser(new int[]{0,2,1});
        assertEquals("MONEY RETURNED!", dispenser.pressStart());
        dispenser = new Dispenser(new int[]{0,2,0});
        assertEquals("MONEY RETURNED!", dispenser.pressStart());
    }

}