package AlgorytmyCwiczenia.ArraysExc;

public class FruitOnTheHouse {

    /**Zwraca ilość owoców, które upadną na dom (współrzędne domu na osi x to @Param {s} i @Param {t}.
     * Pozycja jabłoni na osi x to @Param{a}, a pozycja drzewa poamarańczowego to @Param {b}.
     * Wpółrzędne upadku owoców są wyznaczone przez tablice @Param{apples} oraz @Param{oranges}.*/
    //czas rozwiązania 27 min.
    static int[] countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int appleCounter = 0;
        int orangeCounter = 0;

        for (int i = 0; i < apples.length; i++) {
            if (a + apples[i] >= s && a + apples[i] <= t)
                appleCounter++;
        }

        for (int i = 0; i < oranges.length; i++) {
            if (b + oranges[i] <= t && b + oranges[i] >= s)
                orangeCounter++;
        }

        return new int[]{appleCounter, orangeCounter};
    }
}
