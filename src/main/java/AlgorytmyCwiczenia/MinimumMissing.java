package AlgorytmyCwiczenia;

import java.util.Arrays;

public class MinimumMissing {
    /**Znajduje najmniejszy brakujący element tablicy*/
    public int solution(int[] A) {

        Arrays.sort(A);

        int searched = 1;

        for (int i = 0; i < A.length;) {
            if (i>=A.length)
                break;
            if (A[i] + 1 == A[i+1]){
                i++;
            } else searched = A[i] + 1;
        }
        return searched;
    }
}
