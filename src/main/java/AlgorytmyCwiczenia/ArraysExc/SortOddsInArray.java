package AlgorytmyCwiczenia.ArraysExc;

import java.util.ArrayList;
import java.util.List;

public class SortOddsInArray {
    public static int[] sortArray(int[] array) {

        List<Integer> oddsToSort = new ArrayList<>();
        List<Integer> indexesOfEvens = new ArrayList<>();



        if (array == null || array.length == 0)
            return array;

        for (int i = 0; i < array.length; i++) {
            if (i%2!=0)
                oddsToSort.add(array[i]);
            else
                indexesOfEvens.add(i);
        }

        return array;
    }
}
