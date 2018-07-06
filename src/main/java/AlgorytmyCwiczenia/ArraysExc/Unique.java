package AlgorytmyCwiczenia.ArraysExc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Unique {

    /**
     * Znajduje pierwszy unikalny element w tablicy
     */
    public static double find(double[] arr) {

        double unique = 0;
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {

            if (Arrays.asList(arr).contains(arr[i]))
                counter++;
            if (counter<1)
                continue;
            else unique = arr[i];
        }
        return unique;
    }
}
