package AlgorytmyCwiczenia.ArraysExc;

import java.util.ArrayList;
import java.util.List;

public class OrderedSequence {

    public int[] findFor(int[] arr){

        List<Integer> orderedSequence = new ArrayList<>();

        int[] orderedSequenceArr = new int[orderedSequence.size()];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i+1]>= arr.length)
                break;
            if ((arr[i]+1) == arr[i+1]){
                orderedSequence.add(Integer.valueOf(arr[i]));
            }
        }

        for (int i = 0; i < orderedSequence.size(); i++) {
            orderedSequenceArr[i] = orderedSequence.get(i).intValue();
        }

        return orderedSequenceArr;
    }
}
