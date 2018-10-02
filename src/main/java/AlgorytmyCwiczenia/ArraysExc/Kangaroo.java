package AlgorytmyCwiczenia.ArraysExc;

public class Kangaroo {

    /**Dwa kangury skaczą jednocześnie. Pierwsy startuje z punktu @Param{x1}, drugi z punktu @Param{x2}.
     * Każdy skacze odpowiednio o dystans @Param{v1} oraz @Param{v2}. Zwraca YES jeśli się spotkają na trasie.
     * Trasa ma maksymalną długość x < 10000.*/

    //nie rozwiązane w czasie 30 min. Nie działa z dużymi liczbami.
    static String kangaroo(int x1, int v1, int x2, int v2) {

        while (x1 < 10000 || x2 < 10000) {
            x1 += v1;
            x2 += v2;
            if (x1 == x2)
                return "YES";
        }
        return "NO";
    }

    static String kangaroo2(int x1, int v1, int x2, int v2){
        if ((x1 - x2) % (v2 - v1) == 0)
            return "YES";
        else return "NO";
    }
}
