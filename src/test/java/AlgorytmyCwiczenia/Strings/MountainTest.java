package AlgorytmyCwiczenia.Strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MountainTest {

    private Mountain mountain = new Mountain();

    @Test
    public void countingValleysTest() {
        assertEquals(1, mountain.countingValleys(8,"UDDDUDUU"));
    }

    @Test
    public void countingValleysTest2() {
        assertEquals(1, mountain.countingValleys(8,"DDUUUUDD"));
    }
}