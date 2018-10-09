package AlgorytmyCwiczenia;

public class TreeGrowth {

    /**Drzewo rośnnie w ciągu roku o dwa cykle.
     * W pierwszym zwiększa swoją wysokość dwukrotnie, w drugim o jedną jednostkę.
     * Zwraca wysokosć drzewa po @Param{n} cyklach.*/
    //brak rozwiązania na czas
    static int utopianTree(int n) {

        int treeHeight = 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) treeHeight *= 2;
            else treeHeight++;
        }
        return treeHeight;
    }
}
