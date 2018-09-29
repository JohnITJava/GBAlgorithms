package Queue;

public class PriorityQueue {
    private int[] arr;
    private int size;

    public PriorityQueue(int size) {
        this.size = 0;
        this.arr = new int[size];
    }

    void insert(int value) {
        this.size++;
        if (this.size >= this.arr.length - 1) {
            int[] tempArr = this.arr;
            this.arr = new int[this.size * 2];
            System.arraycopy(tempArr, 0, this.arr, 0, size);
        }
        if (size == 1) this.arr[0] = value;
        else {
            for (int i = size - 1; i >= 1; i--) {
                if (value >= arr[i-1]) {
                    System.arraycopy(arr, i, arr, i+1, size - i);
                    arr[i] = value;
                    return;
                }
            }
        }
    }

    void delete() {
        if (size != 0){
            System.arraycopy(this.arr, 1,
                    this.arr, 0, this.size - 1);
            this.size--;
        }
    }

    public String toString() {
        if (arr == null)
            return "null";
        int iMax = size - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(arr[i]);
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
    }

}
