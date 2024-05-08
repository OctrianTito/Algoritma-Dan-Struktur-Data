public class Pembeli {
    String nama;
    int hp;

    public Pembeli(String nama, int hp) {
        this.nama = nama;
        this.hp = hp;
    }

    Pembeli[] antrian;
    int front, rear, size, max;

    public Pembeli(int n) {
        max = n;
        antrian = new Pembeli[max];
        size = 0;
        front = rear = -1;
    }

    public Pembeli() {

    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + antrian[front].nama + " " + antrian[front].hp);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + antrian[rear].nama + " " + antrian[rear].hp);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekPosition(String namaPembeli){
        if (!isEmpty()) {
            int position = -1;
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                if (antrian[index].nama.equals(namaPembeli)) {
                    position = i + 1; 
                    break;
                }
            }
            if (position != -1) {
                System.out.println("Posisi [" + namaPembeli + "] dalam antrian: " + position);
            } else {
                System.out.println("Posisi" + namaPembeli + " tidak diketahui");
            }
            
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void daftarPembeli() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama + "\t| " + antrian[i].hp);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + "\t| " + antrian[i].hp);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void enqueue(Pembeli dt) {
        if (isFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrian[rear] = dt;
            size++;
        }
    }

    public Pembeli dequeue() {
        Pembeli dt = new Pembeli();
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = antrian[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }
}