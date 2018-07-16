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

        //nie widzi ostatniego unikalnego elementu
        for (int i = 0; i < arr.length; i++) {
            boolean sameNumber = false;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    sameNumber = true;
                    arr[i] = 0.0;
                    break;
                }
            }
            if (!sameNumber) {
                unique = arr[i];
                break;
            }
        }
        return unique;
    }
}
