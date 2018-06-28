package AlgorytmyCwiczenia;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumMissingTest {

    @Test
    public void solution() {
        MinimumMissing minimumMissing = new MinimumMissing();
        int[] example = new int[]{1,2,3};
        assertEquals(4,minimumMissing.solution(example));
    }

    @Test
    public void solution1() {
        MinimumMissing minimumMissing = new MinimumMissing();
        int[] example = new int[]{-1,-2,-3};
        assertEquals(1,minimumMissing.solution(example));
    }

    @Test
    public void solution2() {
        MinimumMissing minimumMissing = new MinimumMissing();
        int[] example = new int[]{1,2,3,4,8,6,16};
        assertEquals(5,minimumMissing.solution(example));
    }
}