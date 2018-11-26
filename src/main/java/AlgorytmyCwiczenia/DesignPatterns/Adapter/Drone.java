package AlgorytmyCwiczenia.DesignPatterns.Adapter;

import java.util.Random;

// nowa klasa różniąca się funkcją od "klasycznego" Attackera
public class Drone {

    private Random random = new Random();
    private String name;

    public Drone(String name) {
        this.name = name;
    }

    String scout(){
        return name + " found " + random.nextInt(11) + " enemies!";
    }

    String move(){
        return name + " moves through " + random.nextInt(11) + " fields.";
    }

    String reportTo(String officersName){
        return name + " reports data to " + officersName + "!";
    }
}
