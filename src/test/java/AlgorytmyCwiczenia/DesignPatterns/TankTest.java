package AlgorytmyCwiczenia.DesignPatterns;

import AlgorytmyCwiczenia.DesignPatterns.Adapter.Tank;
import org.junit.Test;

import static org.junit.Assert.*;

public class TankTest {

    private Tank tank = new Tank("Rudy");

    @Test
    public void inflictDamage() {
        assertTrue(tank.inflictDamage().startsWith("Rudy does "));
        assertTrue(tank.inflictDamage().endsWith(" damage!"));
    }

    @Test
    public void move() {
        assertTrue(tank.move().startsWith("Rudy moves through"));
        assertTrue(tank.move().endsWith(" fields."));
    }

    @Test
    public void assignOfficer() {
        assertEquals("Gustlig drives the Rudy", tank.assignOfficer("Gustlig"));
    }
}