package AlgorytmyCwiczenia.Strings;


import java.util.stream.IntStream;

public class FruitGuy {

    /**Zamienia wszystkie "zgniłe" owoce w koszyku.*/
    public static String[] removeRotten(String[] fruitBasket) {

        if (fruitBasket == null || fruitBasket.length==0){
            return new String[]{};
        }
        int bound = fruitBasket.length;
        IntStream.range(0, bound).filter(i -> fruitBasket[i].contains("rotten")).forEach(i -> fruitBasket[i] = fruitBasket[i].substring(6).toLowerCase());
        return fruitBasket;
    }
}
