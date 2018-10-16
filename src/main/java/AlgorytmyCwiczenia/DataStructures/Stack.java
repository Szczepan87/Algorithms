package AlgorytmyCwiczenia.DataStructures;

//FIFO
public class Stack {
    private int maxSize;
    private int size = 0;
    int[] stack = new int[maxSize];

    public Stack(int maxSize) {
        this.maxSize = maxSize;
    }

    public void push(int value) {
        if (size < maxSize) {
            for (int i = 0; i < stack.length; i++) {
                stack[i] = stack[i + 1];
            }
            stack[0] = value;
        }
    }

    public int pop() {
        int popped = 0;
        if (!isEmpty()) {
            popped = stack[0];
            for (int i = 1; i < stack.length; i++) {
                stack[i - 1] = stack[i];
            }
        }
        return popped;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
