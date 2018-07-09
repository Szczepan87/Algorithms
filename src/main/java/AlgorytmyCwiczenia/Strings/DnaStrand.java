package AlgorytmyCwiczenia.Strings;

public class DnaStrand {

    public static String makeComplement(String dna) {

        char[] divided = dna.toUpperCase().toCharArray();

        for (int i = 0; i < divided.length; i++) {
            if (divided[i] == 'A')
                divided[i] = 'T';
            else if (divided[i] == 'T')
                divided[i] = 'A';
            else if (divided[i] == 'G')
                divided[i] = 'C';
            else if (divided[i] == 'C')
                divided[i] = 'G';
        }

        return String.valueOf(divided);
    }
}
