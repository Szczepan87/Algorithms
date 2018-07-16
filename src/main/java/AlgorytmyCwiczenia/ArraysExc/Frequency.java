package AlgorytmyCwiczenia.ArraysExc;

public class Frequency {
    public static int mostFrequentItemCount(int[] collection) {

        int count = 0;

        if (collection.length == 0)
            return count;

        for (int i = 0; i < collection.length; i++) {
            for (int j = 0; j < collection.length; j++) {
                if (j<i && collection[i] == collection[j+1])
                    count++;
            }
        }

        return count;
    }
}
