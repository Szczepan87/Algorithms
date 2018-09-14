package AlgorytmyCwiczenia.Strings;


import java.util.stream.IntStream;

public class FruitGuy {

    /**
     * Zamienia wszystkie "zgniłe" owoce w koszyku.
     */
    public static String[] removeRotten(String[] fruitBasket) {

        if (fruitBasket == null || fruitBasket.length == 0) {
            return new String[]{};
        } else {
            for (int i = 0; i < fruitBasket.length; i++) {
                if (fruitBasket[i].contains("rotten")) {
                    fruitBasket[i] = fruitBasket[i].substring(6).toLowerCase();
                }
            }
            return fruitBasket;
        }
    }
}
