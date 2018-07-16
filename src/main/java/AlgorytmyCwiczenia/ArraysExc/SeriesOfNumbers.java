package AlgorytmyCwiczenia.ArraysExc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeriesOfNumbers {
    public static int[] findCommon(int[] arr1, int[] arr2) {

        if (arr1.length < 1 || arr2.length < 1)
            return new int[0];

        List<Integer> result = new ArrayList<>();

        if (arr1.length >= arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    if (arr1[i] == arr2[j]) {
                        if (j < arr2.length-1 && arr1[i] + 1 == arr2[j + 1] && arr1[i + 1] == arr2[j + 1]) {
                            result.add(arr1[i]);
                            result.add(arr1[i + 1]);
                            break;
                        }
                    }
                }
            }
        }
        int[] resultArr = new int[result.size()];

        return resultArr;
    }
}
