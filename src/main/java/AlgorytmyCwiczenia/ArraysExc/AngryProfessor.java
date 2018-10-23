package AlgorytmyCwiczenia.ArraysExc;

public class AngryProfessor {

    static String angryProfessor(int k, int[] a) {

        int count = 0;
        for (int anA : a) {
            if (anA <= 0) {
                count++;
            }
        }
        if (count<k) return "YES";
        else return "NO";
    }
}
