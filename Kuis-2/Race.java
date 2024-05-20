public class Race {
    Node head;
    int size;
    DLL klasemen;

    public Race(DLL klasemen) {
        this.klasemen = klasemen;
        head = null;
        size = 0;
    }

    void addFirst(int posisi, String asal, String nama, String tim, String waktu, int poin, int menang) {
        Node newNode = new Node(null, posisi, asal, nama, tim, waktu, poin, menang, head);
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    void addLast(int posisi, String asal, String nama, String tim, String waktu, int poin, int menang) {
        if (head == null) {
            addFirst(posisi, asal, nama, tim, waktu, poin, menang);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(temp, posisi, asal, nama, tim, waktu, poin, menang, null);
        temp.next = newNode;
    }
    
    void addIndexOf(int posisi, String asal, String nama, String tim, String waktu, int poin, int menang) {
        if (posisi == 0) {
            addFirst(posisi, asal, nama, tim, waktu, poin, menang);
            return;
        }
        Node temp = head;
        for (int i = 0; i < posisi - 1; i++) { 
            if (temp != null) {
                temp = temp.next;
            }
        }
        if (temp == null || temp.next == null) {
            addLast(posisi, asal, nama, tim, waktu, poin, menang);
            return;
        }
        Node newNode = new Node(temp, posisi, asal, nama, tim, waktu, poin, menang, temp.next);
        temp.next = newNode;
    }
    

    void addResult(int posisi, String asal, String nama, String tim, String waktu, int poin, int menang) {

        addIndexOf(posisi, asal, nama, tim, waktu, poin, menang);
        klasemen.updatePoints(nama, poin, menang);

    }

    void printHasilRace() {
        System.out.println("+----------+-----------------------+----------------+--------------+----------+----------+");
        System.out.println("|  Posisi  |         Nama          |   Asal Negara  |     Waktu    |   Poin   |  Menang  |");
        System.out.println("+----------+-----------------------+----------------+--------------+----------+----------+");
        
        Node temp = head;
        while (temp != null) {
            System.out.printf("|%9d  |%22s |%15s |%13s  |%8d  |%8d  |\n", temp.posisi, temp.nama, temp.asal, temp.waktu, temp.poin, temp.menang);
            temp = temp.next;
        }
        
        System.out.println("+----------+-----------------------+----------------+--------------+----------+----------+");
    }
    

    void clearRaceResults() {
        head = null;
        size = 0;
    } 
    
}
