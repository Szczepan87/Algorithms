package AlgorytmyCwiczenia;

public class Sum {

    /**
     * Zwraca sumę wszystkich liczb z zakresu
     */
    public int GetSum(int a, int b) {
        int sum = 0;

        if (a == b)
            return a;
        else if (a < b) {
            while (a <= b) {
                sum += a;
                a++;
            }
        } else if (a > b) {
            while (b <= a) {
                sum += b;
                b++;
            }
        }

        return sum;
    }
}
