package AlgorytmyCwiczenia.Strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class BumpyRoadTest {

    @Test
    public void basicTest() {
        assertEquals(BumpyRoad.bumps("n"), "Woohoo!");
        assertEquals(BumpyRoad.bumps("_nnnnnnn_n__n______nn__nn_nnn"), "Car Dead");
        assertEquals(BumpyRoad.bumps("______n___n_"), "Woohoo!");
        assertEquals(BumpyRoad.bumps("nnnnnnnnnnnnnnnnnnnnn"), "Car Dead");
    }

}