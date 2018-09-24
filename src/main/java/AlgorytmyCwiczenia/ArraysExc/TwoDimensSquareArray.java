package AlgorytmyCwiczenia.ArraysExc;

public class TwoDimensSquareArray {

    /**
     * Oblicza różnicę sum liczb znajdujących się po skosie w tablicy dwuwymiarowej o równych wielkościach.
     */
    static int diagonalDifference(int[][] arr) {

        int sumLTR = 0;
        int sumRTL = 0;
        for (int i = 0; i < arr.length; i++) {
            sumLTR += arr[i][i];
        }

        int count = arr.length-1;
        for (int j = 0; j < arr.length; j++) {

            sumRTL += arr[j][count];
            count--;
        }

        return Math.abs(sumLTR - sumRTL);
    }
}
