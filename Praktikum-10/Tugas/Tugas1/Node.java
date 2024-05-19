public class Node {
    int nomor;
    String nama;
    Node next, prev;

    public Node(Node prev, int nomor, String nama, Node next) {
        this.prev = prev;
        this.nomor = nomor;
        this.nama = nama;
        this.next = next;
    }
}
