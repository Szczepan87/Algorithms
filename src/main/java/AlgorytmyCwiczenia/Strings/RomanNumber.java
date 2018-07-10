package AlgorytmyCwiczenia.Strings;

public class RomanNumber {
    public static int toArabic(String romanNumber) {

        int result = 0;

        romanNumber = romanNumber.toUpperCase();

        for (int i = 0; i < romanNumber.toCharArray().length; i++) {
            switch (romanNumber.toCharArray()[i]) {
                case 'M':
                    result += 1000;
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'C':
                    result += 100;
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'X':
                    result += 10;
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'I':
                    result += 1;
                    break;
            }
        }

        if (romanNumber.contains("IV") || romanNumber.contains("IX"))
            result--;
        else if (romanNumber.contains("XL") || romanNumber.contains("XC") || romanNumber.contains("XD") || romanNumber.contains("XM"))
            result -= 20;
        else if (romanNumber.contains("CD") || romanNumber.contains("CM"))
            result -= 200;

        return result;
    }

    public static String fromArabic(int arabicNumber) {

        return null;
    }
}
