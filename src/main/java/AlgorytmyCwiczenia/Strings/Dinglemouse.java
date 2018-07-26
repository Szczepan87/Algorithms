package AlgorytmyCwiczenia.Strings;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Dinglemouse {
    /**Zamienia wartość kąta wskazówki godzinowej zegara na wartość minutową*/
    public static String whatTimeIsIt(final double angle) {

        String hour = String.valueOf((int) angle / 30);
        if (hour.equals("0") || angle == 0)
            hour = "12";
        String minutes = String.valueOf(BigDecimal.valueOf((angle % 30)*2).setScale(0, RoundingMode.DOWN));
        if (hour.length() == 1) {
            hour = "0" + hour;
        }
        if (minutes.length() == 1) {
            minutes = "0" + minutes;
        }

        return String.format("%s:%s", hour, minutes);
    }
}
