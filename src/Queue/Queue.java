package Queue;

public class Queue {
    private int[] queue;
    private int maxSize;
    private int head;
    private int tail;
    private int capacity;

    public Queue(int size) {
        this.maxSize = size;
        queue = new int[size];
        head = 0;
        tail = -1;
        capacity = 0;
    }

    public boolean isEmpty() {
        return capacity == 0;
    }

    public boolean isFull() {
        return capacity == maxSize;
    }

    public int size() {
        return capacity;
    }

    public void insert(int i) {
        if (isFull()) {
            maxSize *= 2;
            int[] temp = new int[maxSize];
            if (tail >= head) {
                System.arraycopy(queue, 0, temp, 0, queue.length);
            } else {
                System.arraycopy(queue, 0, temp, 0, tail + 1);
                System.arraycopy(queue, head, temp, maxSize - (queue.length - head),
                        queue.length - head);
                head = maxSize - head - 1;
            }
            queue = temp;
        }

        if (tail == maxSize - 1) tail = -1;
        queue[++tail] = i;
        capacity++;
    }

    public int remove() {
        if (isEmpty()) throw new RuntimeException("Queue is empty");
        int temp = queue[head++];
        head %= maxSize;
        capacity--;
        return temp;
    }

    public int peek() {
        return queue[head];
    }

    public int getHead() {
        return head;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public int getSize() {
        return maxSize;
    }

    public int[] getQueue() {
        return queue;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public int getTail() {
        return tail;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setQueue(int[] queue) {
        this.queue = queue;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
