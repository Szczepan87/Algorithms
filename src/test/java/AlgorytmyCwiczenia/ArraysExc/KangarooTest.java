package AlgorytmyCwiczenia.ArraysExc;

import org.junit.Test;

import static org.junit.Assert.*;

public class KangarooTest {

    @Test
    public void name() {
        assertEquals("NO", Kangaroo.kangaroo(0, 2, 5, 3));
    }

    @Test
    public void name2() {
        assertEquals("YES", Kangaroo.kangaroo(0, 3, 4, 2));
    }

    @Test
    public void name3() {
        assertEquals("YES", Kangaroo.kangaroo(1113, 612, 1331, 610));
    }

    @Test
    public void name4() {
        assertEquals("NO", Kangaroo.kangaroo(28, 8, 96, 2));
    }
}