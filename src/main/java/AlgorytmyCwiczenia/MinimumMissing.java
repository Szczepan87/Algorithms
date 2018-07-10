package AlgorytmyCwiczenia;

import java.util.Arrays;

public class MinimumMissing {
    /**
     * Znajduje najmniejszy brakujący element tablicy
     */
    public int solution(int[] A) {

        Arrays.sort(A);

        int searched = 1;

        for (int i = 0; i < A.length; i++) {

            if (A[i] + 1 == A[i + 1]) { //przekroczenie indeksu tabliczy
                if (i == A.length -1) {
                    searched = A[A.length - 1] + 1;
                    break;
                }
            } else {
                searched = A[i] + 1;
                break;
            }
        }
        return searched;
    }
}
