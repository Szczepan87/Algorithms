package AlgorytmyCwiczenia;

public class SimpleAlgorithm {

    static double absoluteValue(double x){
        if (x > 0)
            return x;
        else return -x;
    }

    static double sumOfArrElements(double arr[]){
        double sum = 0;

        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static double findMinArrElement(double arr[]){
        double min = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    static double findMaxArrElement(double arr[]){
        double max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max)
                max = arr[i];
        }
        return max;
    }

    static int countElementOfArray(double element, double arr[]){
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            if (element == arr[i])
                counter++;
        }

        return counter;
    }

}
