package AlgorytmyCwiczenia.DesignPatterns.Facade;

import org.junit.Test;

import static org.junit.Assert.*;

public class SmartHomeFacadeTest {

    private SmartHomeFacade smartHomeFacade = new SmartHomeFacade(new Lights(), new WindowShutter());

    @Test
    public void wakeUp() {
        assertEquals("Bedroom opening! LivingRoom opening! Bathroom opening! Kitchen opening! ", smartHomeFacade.wakeUp());
    }

    @Test
    public void eveningMode() {
        assertEquals("LivingRoom closing! Bedroom closing! Bathroom closing! Kitchen closing! LivingRoom " +
                        "lights turned on! Bathroom lights turned on! Kitchen lights turned on! Bedroom lights turned on! ",
                smartHomeFacade.eveningMode());
    }

    @Test
    public void sleepMode() {
        assertEquals("Kitchen lights turned off! Bathroom lights turned off! LivingRoom lights turned off!" +
                " Bedroom lights turned off! ", smartHomeFacade.sleepMode());
    }
}