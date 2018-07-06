package AlgorytmyCwiczenia;

public class SumOfDigits {

    public static int digital_root(int number) {

        if (number<0)
            return number;
        String numberToString = String.valueOf(number);

        if (numberToString.length() <= 1)
            return number;
        while (numberToString.length() > 1) {
            int result = 0;
            for (int i = 0; i < numberToString.toCharArray().length; i++) {
                result += Character.getNumericValue(numberToString.toCharArray()[i]);
            }
            numberToString = String.valueOf(result);
        }

        return Integer.valueOf(numberToString);
    }

    public static int digital_root2(int number){
        while(number > 9){
            number = number/10 + number % 10;
        }
        return(number);
    }
}
