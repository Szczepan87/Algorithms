package AlgorytmyCwiczenia.ArraysExc;

public class HighlightedArea {

    /**Oblicza pole zaznaczenia tekstu @Param{h} to zbiór wysokości poszczególnych liter, a
     * @Param{word} to słowo do zaznaczenia*/
    //czas 9 min.
    static int designerPdfViewer(int[] h, String word) {
        int max = 0;
        for (int i : h) {
            if (i>max)
                max = i;
        }
        return max * word.length();
    }
}
