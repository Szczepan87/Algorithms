package AlgorytmyCwiczenia.ArraysExc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeriesOfNumbers {
    public static int[] findCommon(int[] arr1, int[] arr2) {

        if (arr1.length<1 || arr2.length<1)
            return new int[0];

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        List<Integer> arr1List = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            arr1List.add(arr1[i]);
        }
        for (int element : arr2) {
            if (arr1List.contains(element))
                result.add(element);
        }

        int[] arrResult = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            arrResult[i] = result.get(i);
        }

        return arrResult;
    }
}
