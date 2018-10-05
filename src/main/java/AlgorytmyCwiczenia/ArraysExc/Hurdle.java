package AlgorytmyCwiczenia.ArraysExc;


public class Hurdle {

    /**Funkcja zwracająca różnicę pomiędzy naturalną wysokością skoku @param{k} a maksymalną wysokością płotka
     * na trasie konkurencji skoków przez płotki @Param{height}*/
    //czas 9 min
    static int hurdleRace(int k, int[] height) {

        int max = 0;

        for (int aHeight : height) {
            if (aHeight>max)
                max = aHeight;
        }

        if (max-k<0)
            return 0;
        else return max -k;
    }
}
