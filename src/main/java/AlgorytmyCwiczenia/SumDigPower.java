package AlgorytmyCwiczenia;


import java.util.ArrayList;
import java.util.List;

public class SumDigPower {
    public static List<Long> sumDigPow(long a, long b) {

        List<Long> result = new ArrayList<>();

        double sum = 0;

        for (long number = a; number <= b; number++) {
            if (number > 0 && number <= 9)
                result.add(number);

            for (int i = 0; i < String.valueOf(number).toCharArray().length; i++) {
                sum += Math.pow(String.valueOf(number).toCharArray()[i], i + 1);
            }

            if (sum == number)
                result.add(number);
        }
        return result;

    }
}
