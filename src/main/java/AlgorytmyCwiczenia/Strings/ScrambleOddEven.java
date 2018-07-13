package AlgorytmyCwiczenia.Strings;

public class ScrambleOddEven {
    public static String sortMyString(String stringToSort) {

        String resultString = "";

        for (int i = 0; i < stringToSort.toCharArray().length; i++) {
            if (i % 2 == 0)
                resultString += stringToSort.toCharArray()[i];
        }

        resultString+=" ";

        for (int j = 0; j < stringToSort.toCharArray().length; j++) {
            if (j % 2 != 0)
                resultString += stringToSort.toCharArray()[j];
        }

        return resultString;
    }
}
