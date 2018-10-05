package AlgorytmyCwiczenia.ArraysExc;

import java.util.List;

public class BirthdayChocolate {

    /**tabliczka czekolady z wartościami int musi być podzielona wg klucza:
     * długość paska = @Param{m}, suma kostek = @Param{d}*/
    //brak rozwiązania na czas
    static int birthday(List<Integer> s, int d, int m) {

        int temp = 0;
        int segmentLength = 0;
        int portion = 0;
        for (int i = 0; i < s.size(); i++) {
            temp += s.get(i);
            segmentLength++;
            if (temp > d) {
                segmentLength = 0;
                temp = 0;
            }
            if (temp == d && segmentLength == m) {
                portion++;
                temp = 0;
                if (i - segmentLength + 1 > 0 )
                    i -= segmentLength + 1;
                segmentLength = 0;
            }
        }
        return portion;
    }
}
