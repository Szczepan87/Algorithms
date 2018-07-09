package AlgorytmyCwiczenia.ArraysExc;

public class ReverseArray {

    private int[] arr;
    private int firstToLast;
    private int temp;
    private char letter;
    private char[] word;

    public int[] notUsingLoop(int[] arr) {

        if (arr.length <= 1)
            return arr;

        this.arr = arr;

        temp = arr[firstToLast];
        arr[firstToLast] = arr[arr.length - 1 - firstToLast];
        arr[arr.length - 1 - firstToLast] = temp;
        firstToLast++;

        if (firstToLast == arr.length / 2)
            return arr;

        notUsingLoop(this.arr);
        return arr;
    }

    public String notUsingLoop(String string) {

        if (string.length() <= 1)
            return string;

        this.word = string.toCharArray();

        letter = this.word[firstToLast];
        this.word[firstToLast] = string.charAt(string.length() - 1 - firstToLast);
        word[string.length() -1 - firstToLast] = letter;
        firstToLast++;

        if (firstToLast == string.length()/2)
            return string;

        notUsingLoop(String.valueOf(word));

        return string;
    }
}
