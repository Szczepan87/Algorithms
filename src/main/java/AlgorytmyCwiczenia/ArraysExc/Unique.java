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

        for (int i = 0; i < arr.length; i++) {
            boolean sameNumber = false;

            for (int j = 0; j < arr.length; j++) {

                if (i != j) {

                    if (arr[i] != arr[j]) {
                        sameNumber = false;
                    } else {
                        sameNumber = true;
                        break;
                    }
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
