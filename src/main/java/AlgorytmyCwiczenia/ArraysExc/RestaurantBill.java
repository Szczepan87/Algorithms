package AlgorytmyCwiczenia.ArraysExc;

import java.util.List;

public class RestaurantBill {

    /**Przyjmuje rachunek z restauracji @Param{bill}, pozycję za którą druga osoba nie płaci @Param{k}
     * oraz kwotę, którą płacąca osoba zażyczyła sobie na wspólny rachunek.
     * Zwraca "Bon Appetit" jeśli kwota rachunku została podzielona sprawiedliwie, a winnym przypadku zwraca nadpłaconą
     * kwotę przez pierwsza osobę.*/
    //czas 14 min.
    static String bonAppetit(List<Integer> bill, int k, int b) {
        bill.remove(k);
        int sum = 0;

        for (int i = 0; i < bill.size(); i++) {
            sum+= bill.get(i);
        }

        if ((sum/2)-b==0)
            return "Bon Appetit";
        else return String.valueOf(Math.abs((sum/2)-b));
    }
}
