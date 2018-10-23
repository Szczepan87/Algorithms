package AlgorytmyCwiczenia.ArraysExc;

import org.junit.Test;

import static org.junit.Assert.*;

public class AngryProfessorTest {

    @Test
    public void test1() {
        assertEquals("YES", AngryProfessor.angryProfessor(3, new int[]{-1, -3, 4, 2}));
        assertEquals("NO", AngryProfessor.angryProfessor(2, new int[]{0, -1, 2, 1}));
    }
}