package AlgorytmyCwiczenia.DataStructures;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    private Stack stack = new Stack(5);

    @Test
    public void createStackTest() {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void addingToStackTest() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.size());
    }

    @Test
    public void popTest() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3,stack.pop());
    }

    @Test
    public void peekTest() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3,stack.peek());
    }

    @Test
    public void showTest() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals("1, 2, 3, 0, 0, ",stack.show());
    }
}