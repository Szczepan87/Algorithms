package AlgorytmyCwiczenia.DesignPatterns.Adapter;

import org.junit.Test;

import static org.junit.Assert.*;

public class DroneTest {

    Drone drone = new Drone("UAV");

    @Test
    public void scout() {
        assertTrue(drone.scout().startsWith("UAV found "));
        assertTrue(drone.scout().endsWith(" enemies!"));
    }

    @Test
    public void move() {
        assertTrue(drone.move().startsWith("UAV moves through "));
        assertTrue(drone.move().endsWith(" fields."));

    }

    @Test
    public void reportTo() {
        assertEquals("UAV reports data to Gustlig!", drone.reportTo("Gustlig"));

    }
}