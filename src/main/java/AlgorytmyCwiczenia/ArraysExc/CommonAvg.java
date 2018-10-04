package AlgorytmyCwiczenia.ArraysExc;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CommonAvg {
    /**
     * Zwraca tablicę par różnych liczb, które mają taką samą średnią arytmetyczną.
     */
    public static int[] findIn(int[] arr) {

        List<Pair> pairList = new ArrayList<>();
        List<Integer> sameAvgPairList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (i!=j && arr[i]!= arr[j]){
                    pairList.add(new Pair(arr[i],arr[j]));
                }
            }
        }
        for (int i = 0; i < pairList.size(); i++) {
            for (int j = 0; j < pairList.size(); j++) {
                if (pairList.get(i).getAvg() == pairList.get(j).getAvg())
                    sameAvgPairList.add(pairList.get(j).getA());
                    sameAvgPairList.add(pairList.get(j).getB());
            }
        }
        int[] result = new int[sameAvgPairList.size()];
        for (int i = 0; i < sameAvgPairList.size(); i++) {
            result[i] = sameAvgPairList.get(i);
        }
        return result;
    }

    static class Pair{
        int a;
        int b;
        int avg;

        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
            this.avg = ( a+ b ) / 2;

        }

        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }

        public double getAvg(){
            return avg;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Pair)) return false;
            Pair pair = (Pair) o;
            return getA() == pair.getA() &&
                    getB() == pair.getB() &&
                    getAvg() == pair.getAvg();
        }

        @Override
        public int hashCode() {
            return Objects.hash(getA(), getB(), getAvg());
        }
    }
}
