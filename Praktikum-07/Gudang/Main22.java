import java.util.Scanner;
public class Main22 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in); 
        System.out.print("Tentukan Kapasitas Gudang : ");
        int j = sc1.nextInt();
        Gudang22 gudang  = new Gudang22(j);

        boolean run = true;
        while (run) {
            System.out.println("\nMenu : ");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Lihat barang teratas");
            System.out.println("5. Lihat barang terbawah");
            System.out.println("6. Cari(kode)");
            System.out.println("7. Cari(nama)");
            System.out.println("8. Keluar");
            System.out.print("Pilih Operasi : ");
            int pilihan = sc1.nextInt();

            switch (pilihan) {
                case 1:
                System.out.print("\nMasukkan kode barang : ");
                int kode = sc1.nextInt();

                System.out.print("Masukkan nama barang : ");
                String nama = sc2.nextLine();

                System.out.print("Masukkan kategori : ");
                String kategori = sc2.nextLine();

                Barang22 barangBaru = new Barang22(kode, nama, kategori);
                gudang.tambahBarang(barangBaru);
                    break;
                
                case 2:
                gudang.ambilBarang();
                    break;
                
                case 3:
                gudang.tampilkanTumpukanBarang();
                    break;
                
                case 4:
                gudang.lihatBarangTeratas();
                break;
                
                case 5:
                gudang.lihatBarangTerbawah();
                break;

                case 6:
                System.out.print("Masukkan kode : ");
                int kodeBarang = sc1.nextInt();
                gudang.cariKode(kodeBarang);
                break;

                case 7:
                System.out.print("Masukkan nama : ");
                String name = sc2.nextLine();
                gudang.cariNama(name);
                break;
                
                case 8:
                    run = false;
                    break;
                default:
                System.out.println("Pilihan tidak valid silahkan coba lagi");
            }
        }
    }
}
