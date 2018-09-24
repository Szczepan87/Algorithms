package AlgorytmyCwiczenia.ArraysExc;

import java.util.ArrayList;
import java.util.List;

/**Z dwóch list wyników podaje rezultat puntów.*/
public class Triplet {
    public List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        List<Integer> result = new ArrayList<>();
        int aScore = 0;
        int bScore = 0;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                aScore++;
            } else if (a.get(i) < b.get(i)) {
                bScore++;
            }
        }

        result.add(aScore);
        result.add(bScore);
        return result;
    }
}
