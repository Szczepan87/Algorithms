package AlgorytmyCwiczenia.ArraysExc;

public class ReverseArray {
    public static int[] notUsingLoop(int[] arr){

        int lastToFirst = arr.length-1;
        int firstToLast = 0;
        int temp = arr[firstToLast];
        arr[firstToLast] = arr[lastToFirst];
        arr[lastToFirst] = temp;
        lastToFirst--;
        firstToLast++;
        if (lastToFirst == arr.length/2 || firstToLast == arr.length/2)
            return arr;
        else notUsingLoop(arr);
        return arr;
    }
}
