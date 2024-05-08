import java.util.Scanner;

public class PembeliMain {
    public static void menu() {
        System.out.println("---------------------------");
        System.out.println("Pilih menu: ");
        System.out.println("1. Antrean baru");
        System.out.println("2. Antrean keluar");
        System.out.println("3. Cek antrean terdepan");
        System.out.println("4. Cek antrean paling belakang");
        System.out.println("5. Cek semua antrean");
        System.out.println("6. Cek posisi pembeli");
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan kapasitas antrean: ");
        int jumlah = sc.nextInt();
        Pembeli antri = new Pembeli(jumlah);

        int pilih;

        do {
            menu();
            System.out.print("Masukkan pilihan: ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                System.out.println("---------------------------");
                    System.out.print("Nama        : ");
                    String nama = sc.nextLine();
                    System.out.print("No HP       : ");
                    int hp = sc.nextInt();
                    Pembeli nb = new Pembeli(nama, hp);
                    sc.nextLine();
                    antri.enqueue(nb);
                    break;
                case 2:
                    Pembeli data = antri.dequeue();
                    if (!"".equals(data.nama) && data.hp != 0) {
                        System.out.println("Antrian yang keluar: " + data.nama + "\t| " + data.hp);
                    }
                    break;
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.peekRear();
                    break;
                case 5:
                    antri.daftarPembeli();
                    break;
                case 6:
                    System.out.println("Masukkan nama pembeli: ");
                    String namaPembeli = sc.nextLine();
                    antri.peekPosition(namaPembeli);
            }
        } while (pilih != 0 || pilih != 7);
    }
}