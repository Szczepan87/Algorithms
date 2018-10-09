package AlgorytmyCwiczenia.ArraysExc;

public class ArrayRotation {

    /**
     * Przyjmuje dwuwymiarową tablicę @Param{arr} i obraca ją o @Param{turns} razy. Zwraca tablicę po obrocie.
     */
    public static int[][] leftCircularRotation(int turns, int[][] arr) {

        int middleRow = arr.length % 2 == 0 ? arr.length / 2 + 1 : arr.length / 2;
        int middleCol;
        while (turns > 0) {

            // kierunek obrotu od środka na zewnątrz
            for (int i = middleRow; i >= 0; i--) {

                middleCol = arr[middleRow].length % 2 == 0 ? arr[middleRow].length / 2 + 1 : arr[middleRow].length / 2;

                for (int j = middleCol; j >= 0; j--) {

                }
            }
            turns--;
        }

        return arr;
    }
}
