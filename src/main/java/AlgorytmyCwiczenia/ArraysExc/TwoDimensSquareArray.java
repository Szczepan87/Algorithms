package AlgorytmyCwiczenia.ArraysExc;

public class TwoDimensSquareArray {

    /**
     * Oblicza różnicę sum liczb znajdujących się po skosie w tablicy dwuwymiarowej o równych wielkościach.
     */
    static int diagonalDifference(int[][] arr) {

        int sumLTR = 0;
        int sumRTL = 0;
        int count = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            sumLTR += arr[i][i];
            sumRTL += arr[i][count];
            count--;
        }
        return Math.abs(sumLTR - sumRTL);
    }
}
