public class Queue {
    Nasabah[] data;
    int front, rear, size, max;

    public Queue(int n) {
        max = n;
        data = new Nasabah[max];
        size = 0;
        front = rear = -1;
    }

    public void enqueue(Nasabah dt) {
        if (isFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % max;
            }
            data[rear] = dt;
            size++;
        }
    }

    public Nasabah dequeue() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
            return null;
        } else {
            Nasabah dt = data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                front = (front + 1) % max;
            }
            return dt;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println(" Elemen terdepan : " + data[front]);
        } else {
            System.out.println(" Queue masih kosong ");
        }
    }

    public void print() {
        if(isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = this.front;
            
            while(i != this.rear) {
                System.out.println(data[i].norek + " " + data[i].nama + " " + data[i].alamat + " " + data[i].umur + " " + data[i].saldo);
                i = (i + 1) % max;
            }
            System.out.println(data[i].norek + " " + data[i].nama + " " + data[i].alamat + " " + data[i].umur + " " + data[i].saldo);
            i = (i + 1) % max;
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
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

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Elemen terbelakang: " + data[rear].norek + " " + data[rear].nama +
                    " " + data[rear].alamat + " " + data[rear].umur + " " + data[rear].saldo);
        } else {
            System.out.println("Queue masih kosong");
        }

    }
}