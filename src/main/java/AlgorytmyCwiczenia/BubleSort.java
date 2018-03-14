package AlgorytmyCwiczenia;

public class BubleSort {

    public int[] sortArr(int[] arr) {

        int temp = 0;

        for (int i = 0; i < (arr.length - 1); i++) {

            for (int j = 0; j < (arr.length - 1 -i); j++) { //długość tab[] - 1(aby nie było index out of bound)
                                                            // -i (wcześniej wykonane pętle - nie powtarzać niepotrzebnie przejść po posortowanych elementach)
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
