package AlgorytmyCwiczenia.ArraysExc;
/**Liczy spóźnialskich uczniów (liczby dodatnie w @param{a}) i porównuje z minimalną liczbą uczniów @param k
 * potrzebną do rozpoczecia zajęć. Zwraca "YES" jeśli zajęcia zostaną odwołane.*/
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
