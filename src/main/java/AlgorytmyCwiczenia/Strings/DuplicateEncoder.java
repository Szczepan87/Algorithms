package AlgorytmyCwiczenia.Strings;

public class DuplicateEncoder {

    /**
     * Zwraca '(' jeśli dana litera występuje tylko raz w słowie, w innym przypadku zwraca ')'
     */

    static String encode(String word) {

        char[] encoded = word.toLowerCase().toCharArray();

        // ostatni znak zawsze jest rozpoznawany jako unikalny
        // gdy dwie litery są obok siebie, to ta druga jest jako unikalna

        for (int i = 0; i < encoded.length; i++) {
            boolean isSameLetter = false;

            for (int j = i+1; j < encoded.length; j++) {

                if (encoded[i] == encoded[j]) {
                    isSameLetter = true;
                    break;
                }
            }
            if(isSameLetter){
                encoded[i] = ')';
            }
            else encoded[i] = '(';
        }

        return String.copyValueOf(encoded);
    }
}
