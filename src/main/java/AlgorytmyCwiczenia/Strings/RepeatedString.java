package AlgorytmyCwiczenia.Strings;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class RepeatedString {
    /**Podaję liczbę wystopięń litery a w nieskońćzenie długim stringu w pierwszych n - literach.*/
    public long repeatedString(long n, String s) {
        double count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a')
                count++;
        }

        return BigDecimal.valueOf(count).divide(BigDecimal.valueOf(s.length()),10,RoundingMode.CEILING).multiply(BigDecimal.valueOf(n)).longValue();
    }
}
