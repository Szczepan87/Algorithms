package AlgorytmyCwiczenia.ArraysExc;

public class Positive {

    /**Zwraca sumę wszystkich dodatnich elementów tablicy.*/
    public static int sum(int[] arr){

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                sum += arr[i];
            }
        }

        return sum;
    }

}
