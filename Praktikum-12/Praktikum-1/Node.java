public class Node {
    int data, jarak;
    Node prev, next;

    public Node(Node prev, int data, int jarak, Node next) {
        this.prev = prev;
        this.data = data;
        this.jarak = jarak;
        this.next = next;
    }
}