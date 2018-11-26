package AlgorytmyCwiczenia.DesignPatterns.Facade;

public class Lights {

    private String kitchen = "Kitchen";
    private String bedroom = "Bedroom";
    private String livingRoom = "LivingRoom";
    private String bathroom = "Bathroom";

    public Lights() {
    }

    public String turnOnKitchen() {
        return kitchen + " lights turned on! ";
    }

    public String turnOnBedroom() {
        return bedroom + " lights turned on! ";
    }

    public String turnOnLivingRoom() {
        return livingRoom + " lights turned on! ";
    }

    public String turnOnBathroom() {
        return bathroom + " lights turned on! ";
    }

    public String turnOffKitchen() {
        return kitchen + " lights turned off! ";
    }

    public String turnOffBedroom() {
        return bedroom + " lights turned off! ";
    }

    public String turnOffLivingRoom() {
        return livingRoom + " lights turned off! ";
    }

    public String turnOffBathroom() {
        return bathroom + " lights turned off! ";
    }
}
