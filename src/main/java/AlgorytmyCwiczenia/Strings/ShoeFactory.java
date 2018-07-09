package AlgorytmyCwiczenia.Strings;

public class ShoeFactory {

    public static int gap(String shoeSides) {

        String paired = shoeSides.replace("LR", "");
        paired = paired.replace("RL","");

        return paired.length();
    }
}
