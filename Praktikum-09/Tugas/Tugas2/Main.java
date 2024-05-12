public class Main {
    public static void main(String[] args) {
        QueueMhs mhs = new QueueMhs();
        mhs.enqueue(111, "Anton");
        mhs.enqueue(112, "Prita");
        mhs.enqueue(113, "Yusuf");
        mhs.enqueue(114, "Doni");
        mhs.enqueue(115, "Sari");


        System.out.println("Isi Antrian :");
        mhs.print();

        mhs.dequeue();
        System.out.println("Isi Antrian :");
        mhs.print();

    }
}
