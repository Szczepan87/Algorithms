package AlgorytmyCwiczenia;

public class DuplicateEncoder {

    /**
     * Zwraca '(' jeśli dana litera występuje tylko raz w słowie, w innym przypadku zwraca ')'
     */

    static String encode(String word) {

        char[] encoded = word.toCharArray();

        for (int i = 0; i < encoded.length; i++) {

            for (int j = 0; j < encoded.length; j++) {
                if (encoded[i] == encoded[j])
                    encoded[i] = ')';
                else encoded[i] = '(';
            }
        }

        return String.copyValueOf(encoded);
    }
}
