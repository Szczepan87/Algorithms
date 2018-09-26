package AlgorytmyCwiczenia;

public class Starircase {


    static String staircase(int n) {

        String s = "";

        for (int row = 0; row < n; row++) {

            for (int col = 0; col < n - row; col++) {
                s += " ";
            }

            for (int hash = 0; hash < row + 1; hash++) {
                s += "#";
            }

            s += "\n";
        }

        return s;
    }

}
