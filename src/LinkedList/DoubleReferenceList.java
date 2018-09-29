package LinkedList;

public class DoubleReferenceList {
    Node head;
    Node tail;

    public DoubleReferenceList() {
        this.head = null;
        this.tail = null;
    }

    private class Node {
        int c;
        Node next;
        Node prev;

        private Node(int c) {
            this.c = c;
        }

        @Override
        public String toString() {
            return String.format("C: %d", c);
        }
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void insert(int c){
        Node n = new Node(c);
        n.next = head;

        if (isEmpty()){
            tail = n;
        } else {
            head.prev = n;
        }
        head = n;
    }

    public Integer remove(){
        if (isEmpty()) return null;
        int temp = tail.c;
        tail.prev.next = null;
        tail = tail.prev;
        return temp;
    }

}





