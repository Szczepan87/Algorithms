package AlgorytmyCwiczenia;

public class Anagram {
    public boolean isAnagram(String test, String original) {

        if (test.length() != original.length())
            return false;
        int counter = 0;
        for (int i = 0; i < original.toCharArray().length; i++) {
            for (int j = 0; j < test.toCharArray().length; j++) {
                if (original.toLowerCase().toCharArray()[i] == test.toLowerCase().toCharArray()[j]){
                    counter++;
                    break;
                }
            }
        }
        if (counter == original.length())
            return true;
        else return false;
    }
}
