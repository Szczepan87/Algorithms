package AlgorytmyCwiczenia.DesignPatterns.Facade;

public class WindowShutter {
    
    private String kitchen = "Kitchen";
    private String bedroom = "Bedroom";
    private String livingRoom = "LivingRoom";
    private String bathroom = "Bathroom";

    public WindowShutter() {
    }

    public String openKitchen() {
        return kitchen + " opening! ";
    }

    public String openBedroom() {
        return bedroom + " opening! ";
    }

    public String openLivingRoom() {
        return livingRoom + " opening! ";
    }

    public String openBathroom() {
        return bathroom + " opening! ";
    }

    public String closeKitchen() {
        return kitchen + " closing! ";
    }

    public String closeBedroom() {
        return bedroom + " closing! ";
    }

    public String closeLivingRoom() {
        return livingRoom + " closing! ";
    }

    public String closeBathroom() {
        return bathroom + " closing! ";
    }
}
