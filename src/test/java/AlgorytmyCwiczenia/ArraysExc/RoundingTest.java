package AlgorytmyCwiczenia.ArraysExc;

import org.junit.Test;

import static org.junit.Assert.*;

/**Zaokrągla procentowe oceny wg klucza ocena > 39 zaliczenie.
 * Zaokrągla do 5 jeśli ocena nie wymaga dodania więcej niż 2. */
public class RoundingTest {

    @Test
    public void name() {
        assertArrayEquals(new int[]{75, 67, 38, 33}, Rounding.gradingStudents(new int[]{73, 67, 38, 33}));
    }
}