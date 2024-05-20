    public class DLL {
        Node head;
        int size;

        public DLL() {
            head = null;
            size = 0;
        }
        void addFirst(int posisi, String nama, String tim, int poin, int menang, int podium) {
            Node newNode = new Node(null, posisi, nama, tim, poin, menang, podium, head);
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
        }

        void addLast(int posisi, String nama, String tim, int poin, int menang, int podium) {
            if (head == null) {
                addFirst(posisi, nama, tim, poin, menang, podium);
                return;
            }
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            Node newNode = new Node(temp, posisi, nama, tim, poin, menang, podium, null);
            temp.next = newNode;
        }

        void addIndexOf(int posisi, String nama, String tim, int poin, int menang, int podium) {
            if (posisi == 0) {
                addFirst(posisi, nama, tim, poin, menang, podium);
                return;
            }
            Node temp = head;
            for (int i = 0; i < posisi - 2; i++) {
                if (temp != null) {
                    temp = temp.next;
                }
            }
            if (temp == null || temp.next == null) {
                addLast(posisi, nama, tim, poin, menang, podium);
                return;
            }
            Node newNode = new Node(temp, posisi, nama, tim, poin, menang, podium, temp.next);
            temp.next.prev = newNode;
            temp.next = newNode;
        }

        void updatePoints(String nama, int poin, int menang) {
            Node current = head;
            while (current != null) {
                if (current.nama.equals(nama)) {
                    current.poin += poin;
                    current.menang += menang;
                }
                current = current.next;
            }
        }
        

        void sortByPoints() {
            if (head == null) {
                return;
            }
            boolean swapped;
            do {
                swapped = false;
                Node current = head;
                while (current != null && current.next != null) {
                    if (current.poin < current.next.poin) {
                        // Swap data driver
                        int tempPoin = current.poin;
                        current.poin = current.next.poin;
                        current.next.poin = tempPoin;

                        String tempNama = current.nama;
                        current.nama = current.next.nama;
                        current.next.nama = tempNama;

                        String tempTim = current.tim;
                        current.tim = current.next.tim;
                        current.next.tim = tempTim;

                        int tempMenang = current.menang;
                        current.menang = current.next.menang;
                        current.next.menang = tempMenang;

                        int tempPodium = current.podium;
                        current.podium = current.next.podium;
                        current.next.podium = tempPodium;

                        swapped = true;
                    }
                    current = current.next;
                }
            } while (swapped);
        }

        void printKlasemen() {
            System.out.println("+--------+-----------------------+----------------------+----------+----------+----------+");
            System.out.println("| Posisi |      Nama Pembalap    |         Tim          |   Poin   |  Menang  |  Podium  |");
            System.out.println("+--------+-----------------------+----------------------+----------+----------+----------+");
            
            Node temp = head;
            int posisi = 1;
            while (temp != null) {
                System.out.printf("|%7d |%22s |%21s |%9d |%9d |%9d |\n", posisi, temp.nama, temp.tim, temp.poin, temp.menang, temp.podium);
                temp = temp.next;
                posisi++;
            }
            
            System.out.println("+--------+-----------------------+----------------------+----------+----------+----------+");
        }
        
        
    }
            
            
