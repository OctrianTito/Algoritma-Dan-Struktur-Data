import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception{
        boolean run = true;
        int nomor;
        String nama = null;
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        QueuePelanggan q = new QueuePelanggan();
        do {
            System.out.println("+++++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("+++++++++++++++++++++++++++++++");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.print("Pilih Opsi (1/2/3/4) : ");
            int pilihan = sc1.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("-------------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("-------------------------------");
                    System.out.println("Nomor Antrian : ");
                    nomor = sc1.nextInt();
                    System.out.println("Nama Penerima");
                    nama = sc2.nextLine();
                    q.addLast(nomor, nama);
                    System.out.println("Berhasil Ditambahkan");
                    break;
                case 2:
                    System.out.println(q.getFirst() + " telah selesai divaksinasi");
                    q.removeFirst();
                    break;
                case 3: 
                    System.out.println("+++++++++++++++++++++++");
                    System.out.println("DAFTAR PENGANTRI VAKSIN");
                    System.out.println("+++++++++++++++++++++++");
                    q.print();
                    System.out.println("Sisa antrian : " + q.size());
                    break;
                case 4:
                    run = false;
                    break;
                default:
                    break;
        }
    } while (run);
}
}
