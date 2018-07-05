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

        if (array == null || array.length < 1)
            return array;

        List<Integer> oddsToSort = new ArrayList<>();
        List<Integer> indexesOfEvens = new ArrayList<>();

        //odsiewanie nieparzystych z tablicy i zapamiętanie indeksów liczb parzystych
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)
                oddsToSort.add(array[i]);
            else
                indexesOfEvens.add(i);
        }

        Collections.sort(oddsToSort);

        int j = 0;

        //przepisywanie tablicy - liczby parzyste zostają na swoich miejscach
        for (int i = 0; i < array.length;i++) {
            if (indexesOfEvens.contains(i))
                continue;
            else //przepisz z nieparzystych
                while (j < oddsToSort.size()) {
                    array[i] = oddsToSort.get(j);
                    break;
                }
                j++;
        }
        return array;
    }
}
