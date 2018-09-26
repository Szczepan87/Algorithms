package AlgorytmyCwiczenia.ArraysExc;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ratio {

    static String plusMinus(int[] arr) {
        int negativeCounter = 0;
        int zeroCounter = 0;
        int positiveCounter = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<0)
                negativeCounter++;
            else if (arr[i]==0)
                zeroCounter++;
            else if (arr[i]>0)
                positiveCounter++;
        }
        return BigDecimal.valueOf(positiveCounter).divide(BigDecimal.valueOf(arr.length),6, RoundingMode.HALF_EVEN).toString() + "\n" +
                BigDecimal.valueOf(negativeCounter).divide(BigDecimal.valueOf(arr.length),6, RoundingMode.HALF_EVEN).toString() + "\n" +
                BigDecimal.valueOf(zeroCounter).divide(BigDecimal.valueOf(arr.length),6, RoundingMode.HALF_EVEN).toString() ;

    }
}
