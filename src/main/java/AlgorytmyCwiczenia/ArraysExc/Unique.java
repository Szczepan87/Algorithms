package AlgorytmyCwiczenia.ArraysExc;

public class Unique {

    /**
     * Znajduje pierwszy unikalny element w tablicy
     */
    public static double find(double[] arr) {

        double unique = 0;
        boolean sameNo = false;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (i != j && arr[i] == arr[j]) {
                    sameNo = true;
                    break;
                }
                else sameNo = false;
            }
            if (!sameNo)
                unique = arr[i];
        }
        return unique;
    }
}
