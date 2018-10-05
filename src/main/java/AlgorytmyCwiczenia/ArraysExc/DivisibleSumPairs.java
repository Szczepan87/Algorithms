package AlgorytmyCwiczenia.ArraysExc;

public class DivisibleSumPairs {

    /**
     * Znajduje pary liczb podzielne przez @Param{k}, gdy indeks j>i.
     */
    //czas: 19 min
    static int divisibleSumPairs(int n, int k, int[] ar) {

        int counter = 0;
        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {
                if (j > i && (ar[i] + ar[j]) % k == 0)
                    counter++;

            }
        }
        return counter;
    }
}
