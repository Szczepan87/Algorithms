package AlgorytmyCwiczenia.DataStructures;

//FIFO
public class Stack {
    private int top = 0;
    private int[] stack;

    public Stack(int maxSize) {
        stack = new int[maxSize];

    }

    public void push(int value) {
        if (top < stack.length) {
            stack[top] = value;
            top++;
        } else System.out.println("Stack overflow!");
    }

    public int pop() {
        if (!isEmpty()) {
            top--;
        }
        int popped = stack[top];
        return popped;
    }

    public int peek() {
        return stack[top-1];
    }

    public String show() {
        StringBuilder s = new StringBuilder();
        for (int number : stack) {
            s.append(number).append(", ");
        }
        return s.toString();
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top == 0;
    }
}
