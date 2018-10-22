package AlgorytmyCwiczenia.DataStructures;

//FIFO
public class Queue {

    private int[] queue;
    private int tail;
    private int front;
    private int size;

    public Queue(int size) {
        queue = new int[size];
        tail = 0;
        front = 0;
    }

    public void enqueue(int value) {
        queue[tail] = value;
        tail++;
        size++;
    }

    public int dequeue() {
        int data = queue[front];
        front++;
        size--;
        return data;
    }

    public String show() {
        StringBuilder s = new StringBuilder();
        for (int i = front; i < tail; i++) {
            s.append(queue[i]).append(", ");
        }
        return s.toString();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
