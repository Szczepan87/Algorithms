package AlgorytmyCwiczenia.DesignPatterns.Adapter;

import org.junit.Test;

import static org.junit.Assert.*;

public class AttackerAdapterTest {

    private Drone drone = new Drone("UAV");
    private AttackerAdapter attackerAdapter = new AttackerAdapter(drone);

    @Test
    public void inflictDamage() {
        assertTrue(attackerAdapter.inflictDamage().startsWith("UAV found "));
        assertTrue(attackerAdapter.inflictDamage().endsWith(" enemies!"));
    }

    @Test
    public void move() {
        assertTrue(attackerAdapter.move().startsWith("UAV moves through "));
        assertTrue(attackerAdapter.move().endsWith(" fields."));

    }

    @Test
    public void assignOfficer() {
        assertEquals("UAV reports data to Gustlig!", attackerAdapter.assignOfficer("Gustlig"));
    }
}