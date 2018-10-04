package AlgorytmyCwiczenia.ArraysExc;

public class Clouds {

    /**
     * Przyjmuję tablicę 0 i 1, zwraca najmniejszą ilość skoków (o 1 lub 2)
     * potrzebnych, by przejść przez tablicę, omijajac 1
     */
    public int jumpingOnClouds(int[] c) {

        int jumps = 0;
        for (int i = 0; i < c.length; i++) {
            if (i + 1 < c.length && c[i + 1] != 0) {
                i++;
                jumps++;
            } else if (i + 2 < c.length && c[i + 1] != 1 && c[i + 2] != 1) {
                i++;
                jumps++;
            } else jumps++;
        }
        return jumps-1;
    }

    /**
     * Przyjmuję tablicę 0 i 1, zwraca ilość punktów energii po grze. Dystans skoku wynosi @Param{k} a początkowa ilość
     * punktów energii wynosi 100.
     */

    //czas 10 min.
    static int jumpingOnClouds(int[] c, int k) {
        int energy = 100;

        for (int i = 0; i < c.length; i+=k) {
            if (c[i]!=0)
                energy-=2;
            energy--;
        }
        return energy;
    }
}
