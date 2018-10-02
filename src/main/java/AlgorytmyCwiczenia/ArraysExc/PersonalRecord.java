package AlgorytmyCwiczenia.ArraysExc;

public class PersonalRecord {

    /**Z tablicy wyników @Param{scores} zwraca liczbę pobitych osobistych rekordów punktowych
     * (najniższych i najwyższych).*/

    //czas 14 min.
    static int[] breakingRecords(int[] scores) {
        int lowestScore = scores[0];
        int highestScore = scores[0];
        int highRecordBroken = 0;
        int lowRecordBroken = 0;

        for (int i = 1; i < scores.length; i++) {
            if (scores[i]<lowestScore){
                lowestScore = scores[i];
                lowRecordBroken++;
            }
            if (scores[i]> highestScore){
                highestScore = scores[i];
                highRecordBroken++;
            }
        }

        return new int[]{highRecordBroken, lowRecordBroken};
    }
}
