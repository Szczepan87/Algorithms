package AlgorytmyCwiczenia;

public class SequenceSum {
    public static String showSequence(int value) {

        int current = 0;
        int sum = 0;
        String result = "0";

        if (value < 0)
            return value + "<0";
        if (value == 0)
            return value + "=" + value;

        while (current <= value) {
            sum += current;
            current++;
            if (current <= value)
                result = result + "+" + current;
        }

        return result + " = " + sum;
    }
}
