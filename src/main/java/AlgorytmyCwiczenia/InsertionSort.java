package AlgorytmyCwiczenia;

public class InsertionSort {

    public int[] insertSort(int[] arr){
        int j, key, temp;

        for (int i = 1; i < arr.length; i++) {
            key = arr[i];
            j = i -1;

            while (j >= 0 && key < arr[j]){
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j--;
            }
        }
        return arr;
    }

}
