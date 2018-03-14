package AlgorytmyCwiczenia;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] array = new int[]{1, 58 , 25, 23, 24, 1, 5};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertSort(array);
        for (int i : array) {
            System.out.print(i + "  ");
        }

    }
}
