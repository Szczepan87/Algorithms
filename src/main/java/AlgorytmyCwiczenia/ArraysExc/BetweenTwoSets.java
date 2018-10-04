package AlgorytmyCwiczenia.ArraysExc;

public class BetweenTwoSets {

    /**Zwraca liczbę wystąpień warunku: element pierwszej tablicy jest dzielnikiem wszystkich elementów
     * w pierwszej tablicy oraz jest dzielnikiem wszystkich elementów w drugiej tablicy.*/

    //brak rozwiązania na czas
    static int getTotalX(int[] a, int[] b) {
        int counter = 0;

        for (int i = 0; i < a.length; i++) {
            boolean aFactor = false;
            for (int j = 0; j < a.length; j++) {
                if (i + 1 < a.length && a[i] % a[j] != 0)
                    break;
                aFactor = true;
            }

            for (int k = a.length - 1; k >= 0; k--) {
                if (k - 1 >=0 && a[i] % a[k] != 0)
                    break;
                aFactor = true;
            }
            if (aFactor){
                for (int l = 0; l < b.length; l++) {
                    if (l + 1 < a.length && a[i] % b[l] == 0)
                        counter++;
                }
            }
        }
        return counter;
    }
}
