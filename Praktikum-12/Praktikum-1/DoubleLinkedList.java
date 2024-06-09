public class DoubleLinkedList {
    Node head;
    int size;

    public DoubleLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item, int jarak) {
        Node newNode = new Node(null, item, jarak, head);
        if (!isEmpty()) {
            head.prev = newNode;
        }
        head = newNode;
        size++;
    }

    public int getJarak(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index diluar batas.");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.jarak;
    }

    public void updateJarak(int tujuan, int jarakBaru) {
        Node tmp = head;
        while (tmp != null) {
            if (tmp.data == tujuan) {
                tmp.jarak = jarakBaru;
                return;
            }
            tmp = tmp.next;
        }
    }

    public void remove(int index) {
        if (isEmpty()) return;
        Node current = head;
        while (current != null) {
            if (current.data == index) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                size--;
                return;
            }
            current = current.next;
        }
    }

    public int size() {
        return size;
    }

    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index diluar batas.");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public void clear() {
        head = null;
        size = 0;
    }
}