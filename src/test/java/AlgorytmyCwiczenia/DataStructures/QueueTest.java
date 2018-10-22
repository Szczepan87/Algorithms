package AlgorytmyCwiczenia.DataStructures;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    private Queue queue = new Queue(5);

    @Test
    public void createQueueTest() {
        assertTrue(queue.isEmpty());
        assertEquals(0, queue.size());
    }

    @Test
    public void enqueueTest() {
        queue.enqueue(5);
        assertEquals("5, ", queue.show());
    }

    @Test
    public void dequeueTest() {
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(1);
        queue.dequeue();
        assertEquals("4, 3, 2, 1, ", queue.show());
    }
}