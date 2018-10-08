package AlgorytmyCwiczenia;

public class CatsAndMouse {

    /**
     * Biorąc pozycję kota A @Param{x}, kota B @Param{y} oraz myszy @Param{z} zwraca który kot złapie mysz.
     * Jeśli oba koty dopadną mysz w tym smamym czasie zaczynają się bić, a mysz ucieka.*/
    //czas 14 min.
    static String catAndMouse(int x, int y, int z) {
        if (Math.abs(z - x) == Math.abs(z - y))
            return "Mouse C";
        else if (Math.abs(z - x) > Math.abs(z - y))
            return "Cat B";
        else return "Cat A";
    }
}
