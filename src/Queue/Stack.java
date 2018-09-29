package Queue;

public class Stack {
    private int[] stack;
    private int head;
    private int size;

    public Stack(int size) {
        this.size = size;
        stack = new int[size];
        head = -1;
    }

    public boolean isEmpty() {
        return head == -1;
    }

    public boolean isFull() {
        return head == size - 1;
    }

    public boolean push(int value) {
        if (isFull()) return false;
        stack[++head] = value;
        return true;
    }

    public int pop() {
        if (isEmpty())
            throw new RuntimeException("Stack is empty");
        return stack[head--];
    }

    public int peek() {
        if (isEmpty())
            throw new RuntimeException("Stack is empty");
        return stack[head];
    }

    public String toString() {
        if (stack == null)
            return "null";
        int iMax = size - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append((char) stack[i]);
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
    }
}
