package AlgorytmyCwiczenia.DesignPatterns.Adapter;

public class AttackerAdapter implements Attacker{

    private Drone drone;

    public AttackerAdapter(Drone drone) {
        this.drone = drone;
    }

    @Override
    public String inflictDamage() {
        return drone.scout();
    }

    @Override
    public String move() {
        return drone.move();
    }

    @Override
    public String assignOfficer(String officersName) {
        return drone.reportTo(officersName);
    }
}
