package AlgorytmyCwiczenia.ArraysExc;

import java.util.Arrays;

/**Zwraca minimalną ilość potrzebych wykasowań aby tablica zawierała wyłacznie takie same elementy.*/
public class Equalize {
    static int equalizeArray(int[] arr) {

        int counter = 1;
        int temp = 0;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                if (j != i && arr[i] == arr[j]) {
                    counter++;
                }
            }
            if (counter > temp) {
                temp = counter;
            }
            counter = 1;
        }
        return arr.length - temp;
    }

}
