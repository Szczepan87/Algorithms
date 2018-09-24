package AlgorytmyCwiczenia.ArraysExc;

import java.util.ArrayList;
import java.util.List;

public class Rotation {

    /**Przesuwa tablicę w lewo o @Param{d} pozycji*/
    static int[] rotLeft(int[] a, int d) {
        List<Integer> numbers = new ArrayList<>();

        for (int element : a) {
            numbers.add(element);
        }
        while (d>0){
            int temp = numbers.get(0);
            numbers.remove(numbers.get(0));
            numbers.add(temp);
            d--;
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = numbers.get(i);
        }
        return a;
    }
}
