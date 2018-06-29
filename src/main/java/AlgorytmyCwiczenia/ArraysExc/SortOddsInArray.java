package AlgorytmyCwiczenia.ArraysExc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortOddsInArray {

    /**
     * Sortuje tylko nieparzyste elemnty tablicy, a parzyste zostawia na swoich miejscach
     */
    public static int[] sortArray(int[] array) {

        List<Integer> oddsToSort = new ArrayList<>();
        List<Integer> indexesOfEvens = new ArrayList<>();

        if (array == null || array.length == 0)
            return array;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)
                oddsToSort.add(array[i]);
            else
                indexesOfEvens.add(i);
        }

        Collections.sort(oddsToSort);

        for (int i = 0; i < array.length;) {
            if (indexesOfEvens.contains(i))
                i++;
            else //przepisz z nieparzystych
                for (int j = 0; j < oddsToSort.size(); j++) {
                    array[i] = oddsToSort.get(j);
                    i++;
                }
        }
        return array;
    }
}
