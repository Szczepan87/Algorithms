package AlgorytmyCwiczenia.ArraysExc;

import java.util.ArrayList;
import java.util.List;

class OrderedSequence {

    int[] findFor(int[] arr) {

        List<Integer> orderedSequence = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if ((i + 1) >= arr.length) {
                break;
            }
            //czy następny element jest o jeden większy, czyli jest w polejności
            if ((arr[i] + 1) == arr[i + 1]) {
                orderedSequence.add(arr[i]);
            }
            //czy poprzeni element jest o 1 mniejszy czyli jest w kolejności
            else if ((arr[i] - 1) == arr[i - 1]) {
                orderedSequence.add(arr[i]);
            }
            //jeśli ostatnio dodany element jest taki sam jak właśnie dodawany to usuń ostatnio dodany
            if ((arr[i + 1] == orderedSequence.get(orderedSequence.size() - 1)))
                orderedSequence.remove(orderedSequence.size() - 1);
        }

        int[] orderedSequenceArr = new int[orderedSequence.size()];

        //przepisanie listy do tablicy intów
        for (int i = 0; i < orderedSequence.size(); i++) {
            orderedSequenceArr[i] = orderedSequence.get(i);
        }

        return orderedSequenceArr;
    }
}
