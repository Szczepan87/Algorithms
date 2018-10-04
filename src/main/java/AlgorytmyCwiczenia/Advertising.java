package AlgorytmyCwiczenia;

import java.math.BigDecimal;
import static java.math.RoundingMode.FLOOR;

public class Advertising {

    /**Zwraca ilość polubień posta przy założeniach (po każdym dniu połowa z wyświetleń otrzymuje polubienie
     * i dzieli się z 3 swoimi znajomymi) po @Param{n} dniach.*/
    //czas 24 min.
    static int viralAdvertising(int n) {
        int recipients = 5;
        int likes = 0;

        for (int i = 0; i < n; i++) {
            likes += new BigDecimal(recipients).divide(BigDecimal.valueOf(2),FLOOR).intValue();
            recipients = new BigDecimal(recipients).divide(BigDecimal.valueOf(2),FLOOR).intValue() * 3;
        }

        return likes;
    }
}
