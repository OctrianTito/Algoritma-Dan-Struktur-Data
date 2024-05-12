/**
 * QueueMhs
 */
public class QueueMhs {
    Node head, tail;
    
    public QueueMhs() {
        this.head = null;
        this.tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    public void enqueue(int nim, String nama){
       Node nd = new Node(nim, nama, null);
       if (tail == null) {
            head = tail = nd;
            return;
       }
       tail.next = nd;
       tail = nd;
    }

    public void dequeue(){
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else {
            System.out.println("Dequeue: " + head.nim + " " + head.nama);
            head = head.next;
            if (head == null) {
                tail = null; 
            }
        }
    }

    public void print(){
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.print("\n" + tmp.nim + " "+ tmp.nama + "\t");
                tmp = tmp.next;
            }
            System.out.println(" ");
        } else {
            System.out.println("Linked List kosong");
        }
    }
}