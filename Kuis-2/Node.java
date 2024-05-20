public class Node {
    String nama, tim, waktu, asal;
    Node next, prev;
    int menang, podium, posisi;
    int poin;

    public Node(Node prev, int posisi, String nama, String tim, int poin, int menang, int podium, Node next) {
        this.nama = nama;
        this.tim = tim;
        this.poin = poin;
        this.prev = prev;
        this.next = next;
        this.menang = menang;
        this.podium = podium;
        this.posisi = posisi;
    }

    public Node(Node prev, int posisi, String asal, String nama, String tim, String waktu, int poin, int menang, Node next) {
        this.posisi = posisi;
        this.nama = nama;
        this.tim = tim;
        this.poin = poin;
        this.waktu = waktu;
        this.prev = prev;
        this.next = next;
        this.menang = menang;
        this.asal = asal;
    }
}