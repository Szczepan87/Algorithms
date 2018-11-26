package AlgorytmyCwiczenia.DesignPatterns.Adapter;


import java.util.Random;

//podstawowa klasa korzystająca z interface Attacker
public class Tank implements Attacker {

    private String name;
    private Random random = new Random();

    public Tank(String name) {
        this.name = name;
    }

    @Override
    public String inflictDamage() {
        return name + " does " + random.nextInt(101) +" damage!";
    }

    @Override
    public String move() {
        return name + " moves through" + random.nextInt(6)+  " fields.";
    }

    @Override
    public String assignOfficer(String officersName) {
        return officersName + " drives the " + name;
    }
}
