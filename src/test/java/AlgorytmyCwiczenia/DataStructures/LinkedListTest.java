package AlgorytmyCwiczenia.DataStructures;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    private LinkedList linkedList = new LinkedList();


    @Test
    public void createLinkedListTest() {
        assertFalse(linkedList.isNotEmpty());
    }

    @Test
    public void addToLinkedListTest() {
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        assertEquals("1, 2, 3, 4, ", linkedList.show());
    }

    @Test
    public void removeFirstFromLinkedListTest() {
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.removeFirst();
        assertEquals("2, 3, 4, ", linkedList.show());
    }

    @Test
    public void removeValueFromLinkedListTest() {
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.remove(4);
        assertEquals("1, 2, 3, ", linkedList.show());
    }

    @Test
    public void findValueFromLinkedListTest() {
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.remove(4);
        assertTrue(linkedList.contains(3));
        assertFalse(linkedList.contains(7));
    }
}