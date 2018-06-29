package AlgorytmyCwiczenia;

public class Money {
    public static int calculateYears(double principal, double interest, double tax, double desired) {

        int years = 0;

        if (principal == desired)
            return 0;

        while (principal <= desired){
            principal = principal + (principal*interest - principal*interest*tax);
            years++;
        }

        return years;
    }
}
