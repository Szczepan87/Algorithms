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

        if (arabicNumber < 1 || arabicNumber > 10000)
            return "Numer nie może być większy niż 10000 i mniejszy niż 1.";

        String result = "";
        if (String.valueOf(arabicNumber).length() == 4) {
            thousandsDigit(Character.getNumericValue(String.valueOf(arabicNumber).charAt(0)));
        } else if (arabicNumber % 1000 != 0) {
            hundredsDigit(Character.getNumericValue(String.valueOf(arabicNumber).charAt(0)));
        } else if (arabicNumber % 100 != 0) {
            secondToLastDigit(Character.getNumericValue(String.valueOf(arabicNumber).charAt(0)));
        } else if (arabicNumber % 10 != 0) {
            lastDigit(Character.getNumericValue(String.valueOf(arabicNumber).charAt(0)));
        }


        //result = new StringBuilder(result).reverse().toString();

        return result;

    }

    private static String thousandsDigit(int digit) {
        String string = "";

        for (int i = 0; i <= digit; i++) {
            string += "M";
        }

        return string;
    }

    private static String hundredsDigit(int digit) {

        String string = "";
        if (digit >= 1 && digit <= 3) {
            while (digit > 1) {
                string += "C";
                digit--;
            }
        } else if (digit == 4)
            return string += "CD";
        else if (digit == 5)
            return string += "D";
        else if (digit > 5 && digit < 9) {
            string = "D";
            while (digit > 5) {
                string += "C";
                digit--;
            }
        }
        if (digit == 9)
            return string += "CM";
        return string;
    }

    private static String secondToLastDigit(int digit) {

        String string = "";
        if (digit >= 1 && digit <= 3) {
            while (digit > 1) {
                string += "X";
                digit--;
            }
        } else if (digit == 4)
            return string += "XL";
        else if (digit == 5)
            return string += "L";
        else if (digit > 5 && digit < 9) {
            string = "L";
            while (digit > 5) {
                string += "X";
                digit--;
            }
        }
        if (digit == 9)
            return string += "XC";
        return string;


    }

    private static String lastDigit(int digit) {
        String string = "";
        if (digit >= 1 && digit <= 3) {
            while (digit > 1) {
                string += "I";
                digit--;
            }
        } else if (digit == 4)
            return string += "IV";
        else if (digit == 5)
            return string += "V";
        else if (digit > 5 && digit < 9) {
            string = "V";
            while (digit > 5) {
                string += "I";
                digit--;
            }
        }
        if (digit == 9)
            return string += "IX";
        return string;
    }
}
