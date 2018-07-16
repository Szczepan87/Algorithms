package AlgorytmyCwiczenia.Strings;

public class BumpyRoad {
    public static String bumps(final String road) {

        int counter = 0;
        for (int i = 0; i < road.toCharArray().length; i++) {
            if (road.toCharArray()[i] == 'n')
                counter++;
        }
        return counter > 15 ? "Car Dead" : "Woohoo!";
    }
}
