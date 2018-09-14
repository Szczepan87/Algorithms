package AlgorytmyCwiczenia.Strings;

public class Mountain {

    /**
     * Zwraca liczbę dolin, gdzie @Param s jest trasą, @Param n liczbą króków, znak U to krok N.P.M
     * a D to krok w kierunku P.P.M
     */
    public int countingValleys(int n, String s) {
        char[] chars = new char[s.length()];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = s.charAt(i);
        }
        int height = 0;
        int aValley = 0;
        boolean belowSeaLevel = false;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'U') {
                height++;
            } else {
                height--;
            }
            if (height < 0) {
                if (!belowSeaLevel) {
                    belowSeaLevel = true;
                    aValley++;
                }
            } else belowSeaLevel = false;
        }
        return aValley;
    }
}
