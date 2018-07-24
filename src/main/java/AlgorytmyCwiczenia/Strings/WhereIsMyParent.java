package AlgorytmyCwiczenia.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WhereIsMyParent {
    public static String findChildren(String text) {

        char[] textArr = text.toCharArray();

        List<Character> list = new ArrayList<>();

        Arrays.sort(textArr);

        for (int i = 0; i < textArr.length; i++) {
            if (Character.isUpperCase(textArr[i])){
                for (int j = 0; j < textArr.length; j++) {
                    if (Character.getNumericValue(textArr[j]) == Character.getNumericValue(textArr[i]+32)){
                        list.add(textArr[j]);
                    }
                }
            }
        }
        text = list.toString().replace(", ","").replace("[", "").replace("]","");
        return text;
    }
}
