package AlgorytmyCwiczenia.ArraysExc;

public class MinMax {

    /**
     * Zwraca tablicę największej i mnajmniejszej wartości z tablicy
     */
    public static int[] minMax(int[] arr) {

        int[] result = new int[2];
        int max = arr[0];
        int min = arr[0];

        for (int value : arr) {
            if (value <= min) {
                min = value;
                result[0] = min;
            }
            if (value >= max) {
                max = value;
                result[1] = max;
            }
        }
        return result;
    }
}
