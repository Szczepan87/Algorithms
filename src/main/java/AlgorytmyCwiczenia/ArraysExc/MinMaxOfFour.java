package AlgorytmyCwiczenia.ArraysExc;

import java.util.Arrays;

public class MinMaxOfFour {

    public static void miniMaxSum(int[] arr) {

        Arrays.sort(arr);

        int maxSum = 0;
        int minSum = 0;

        for (int i = 0; i < arr.length - 1 ; i++) {
            minSum+=arr[i];
        }

        for (int i = 1; i < arr.length; i++) {
            maxSum+=arr[i];
        }
        System.out.println(minSum +" "+ maxSum);
    }
}
