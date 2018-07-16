package AlgorytmyCwiczenia.Strings;

public class Keypad {
    /**Zwraca ilość naciśnięć przycisku na "starej" klawiaturze numerycznej.*/
    public static int presses(String phrase) {

        phrase = phrase.toUpperCase();

        int count = 0;

        char[] one = new char[]{'1', ' ', 'A', 'D', 'G', 'J', 'M', 'P', 'T', 'W', '*', '#'};
        char[] two = new char[]{'0', 'B', 'E', 'H', 'K', 'N', 'Q', 'U', 'X'};
        char[] three = new char[]{'C', 'F', 'I', 'L', 'O', 'R', 'V', 'Y'};
        char[] four = new char[]{'S', 'Z', '2', '3', '4', '5', '6', '8'};

        for (int i = 0; i < phrase.toCharArray().length; i++) {

            for (int j = 0; j < one.length; j++) {
                if (phrase.toCharArray()[i] == one[j]) {
                    count++;
                    break;
                }
            }

            for (int j = 0; j < two.length; j++) {
                if (phrase.toCharArray()[i] == two[j]) {
                    count += 2;
                    break;
                }
            }
            for (int j = 0; j < three.length; j++) {
                if (phrase.toCharArray()[i] == three[j]) {
                    count += 3;
                    break;
                }
            }
            for (int j = 0; j < four.length; j++) {
                if (phrase.toCharArray()[i] == four[j]) {
                    count += 4;
                    break;
                }
            }

            if (phrase.toCharArray()[i] == '7' || phrase.toCharArray()[i] == '9')
                count += 5;
        }

        return count;
    }

    public static int codeWars(String phrase) {
        String[] keys = {"1", "ABC2", "DEF3", "GHI4", "JKL5", "MNO6", "PQRS7", "TUV8", "WXYZ9", "*", " 0", "#"};

        int nPresses = 0;

        for (char c : phrase.toUpperCase().toCharArray())
            for (String s : keys)
                nPresses += s.indexOf(c) + 1;

        return nPresses;

    }
}
