package AlgorytmyCwiczenia.DesignPatterns.Facade;

// klasa udająca SmartDom wykonująca poszczególne kroki w zależności od trybu dnia.
public class SmartHomeFacade {

    private Lights lights;
    private WindowShutter windowShutter;

    public SmartHomeFacade(Lights lights, WindowShutter windowShutter) {
        this.lights = lights;
        this.windowShutter = windowShutter;
    }

    public String wakeUp(){
        return windowShutter.openBedroom() +
        windowShutter.openLivingRoom() +
        windowShutter.openBathroom() +
        windowShutter.openKitchen();
    }

    public String eveningMode(){
        return windowShutter.closeLivingRoom() +
        windowShutter.closeBedroom() +
        windowShutter.closeBathroom() +
        windowShutter.closeKitchen() +
        lights.turnOnLivingRoom() +
        lights.turnOnBathroom() +
        lights.turnOnKitchen() +
        lights.turnOnBedroom();
    }

    public String sleepMode() {
        return lights.turnOffKitchen() +
        lights.turnOffBathroom() +
        lights.turnOffLivingRoom() +
        lights.turnOffBedroom();
    }
}
