package AlgorytmyCwiczenia;

public class Factorial {

    public int factorial(int n) {

        int result = 1;

        if (n < 0 || n > 12)
            throw new IllegalArgumentException();

        while (n > 1) {
            result *= n;
            n--;
        }
        return result;
    }
}

