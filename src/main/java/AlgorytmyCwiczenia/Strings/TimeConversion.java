package AlgorytmyCwiczenia.Strings;

public class TimeConversion {
    static String timeConversion(String s) {

        boolean isPM;
        isPM = s.contains("PM");

        s = s.substring(0,s.length()-2);

        String[] parts = s.split(":");
        if (isPM)
            return (Integer.parseInt(parts[0]) + 12) + ":" + parts[1] + ":" + parts[2];
        else if (s.startsWith("12") && !isPM)
            return "00:" + parts[1] + ":" + parts[2];
        else
            return s;

    }
}
