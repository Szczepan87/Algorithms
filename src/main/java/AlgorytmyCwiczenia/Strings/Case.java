package AlgorytmyCwiczenia.Strings;

public class Case {
    public static String alternateCase(String string) {

        char[] arr = string.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (Character.isUpperCase(arr[i])) {
                arr[i] = Character.toLowerCase(arr[i]);
            } else arr[i] = Character.toUpperCase(arr[i]);
        }

        return String.valueOf(arr);
    }
}
