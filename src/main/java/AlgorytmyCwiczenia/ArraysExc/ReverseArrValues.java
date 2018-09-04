package AlgorytmyCwiczenia.ArraysExc;

public class ReverseArrValues {

    public static int[] reverseValueOf(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 0)
                array[i] = Math.abs(array[i]);
            else array[i] = -array[i];
        }
        return array;
    }
}
