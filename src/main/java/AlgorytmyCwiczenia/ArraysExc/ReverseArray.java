package AlgorytmyCwiczenia.ArraysExc;

public class ReverseArray {

    private int[] arr;
    private int firstToLast;
    private int temp;

    public int[] notUsingLoop(int[] arr) {

        if (arr.length <= 1)
            return arr;

        this.arr = arr;

        temp = arr[firstToLast];
        arr[firstToLast] = arr[arr.length - 1 - firstToLast];
        arr[arr.length - 1 - firstToLast] = temp;
        firstToLast++;

        if (firstToLast == arr.length / 2)
            return arr;

        notUsingLoop(this.arr);
        return arr;
    }
}
