package AlgorytmyCwiczenia.ArraysExc;

public class OddOrEven {

    public static String oddOrEven (int[] array) {

        int sum = 0;
        for (int element : array) {
            sum += element;
        }

        return sum % 2 != 0 ? "odd" : "even";
    }

}
