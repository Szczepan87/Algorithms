package AlgorytmyCwiczenia.Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ToSmallest {

    public static long[] smallest(long n) {

        List<Character> numberCharList = new ArrayList<>();
        char[] numberCharArr = Long.valueOf(n).toString().toCharArray();

        for (char c : numberCharArr) {
            numberCharList.add(c);
        }

        long[] result = new long[3];

        int temp = 9;
        int index = 0;

        for (int i = 0; i < numberCharList.size(); i++) {
            if (Character.getNumericValue(numberCharList.get(i)) < temp) {
                temp = Character.getNumericValue(numberCharList.get(i));
                char tempChar = numberCharList.get(i);
                numberCharList.remove(numberCharList.get(i));
                numberCharList.add(0,tempChar);
                index = i;
            }
        }
        IntStream.range(0, numberCharList.size()).forEach(i -> numberCharArr[i] = numberCharList.get(i));
        result[0] = Long.valueOf(String.valueOf(numberCharArr));
        result[1] = temp;
        result[2] = index;
        return result;
    }

}
