package AlgorytmyCwiczenia.ArraysExc;

import java.util.ArrayList;

public class Metro {

    /**Na podstawie tablicy intów zawierającej liczbę pasażerów wsiadających i wysiadających na przystankach
     * zwraca ostateczną liczbę pasażerów w metrze*/
    public static int countPassengers(ArrayList<int[]> stops) {
        int noOfPassengers = 0;
        for (int i = 0; i < stops.size(); i++) {

            for (int j = 0; j < stops.get(i).length;j++) {
                noOfPassengers += stops.get(i)[j];
                j++;
                noOfPassengers -= stops.get(i)[j];
            }
        }
        if (noOfPassengers<0)
            throw new IllegalArgumentException();
        return noOfPassengers;
    }
}
