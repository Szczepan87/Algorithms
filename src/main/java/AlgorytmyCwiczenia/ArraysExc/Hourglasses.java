package AlgorytmyCwiczenia.ArraysExc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Hourglasses {

    /**Liczy sumy liczb wg wzorca w tablicy dwuwymiarowej o równych długościach (6), Wzorzec:
     * N N N
     *   N
     * N N N*/
    static int hourglassSum(int[][] arr) {
        int hourglassSum;
        List<Integer> sums = new ArrayList<>();

        for (int column = 0; column < arr.length; column++) {
            for (int row = 0; row < arr.length; row++) {

                if (column + 2 < arr.length && row + 2 < arr.length){
                    hourglassSum = arr[column][row] + arr[column][row+1] + arr[column][row+2] + arr[column+1][row+1] + arr[column+2][row] + arr[column+2][row+1] + arr[column+2][row+2];
                    sums.add(hourglassSum);
                }
            }
        }
        Collections.sort(sums);
        return sums.get(sums.size()-1);
    }
}
