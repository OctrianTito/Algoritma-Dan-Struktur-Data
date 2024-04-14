import java.util.Scanner;

public class BukuMain22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        PencarianBuku22 data = new PencarianBuku22();
        int jumBuku = 5;

        System.out.println("===========================================");
        System.out.println("Masukkan data buku secara urut dari kode buku terkecil: ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("------------------------------------------");
            System.out.print("Kode Buku\t: ");
            int kodeBuku = input.nextInt();
            System.out.print("Judul Buku\t: ");
            String judulBuku = input.nextLine(); 
            judulBuku = input.nextLine(); 
            System.out.print("Tahun Terbit\t: ");
            int tahunTerbit = input.nextInt();
            System.out.print("Pengarang\t: ");
            String pengarang = input.nextLine(); 
            pengarang = input.nextLine(); 
            System.out.print("Stock\t\t: ");
            int stock = input.nextInt();

            Buku m = new Buku(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambahBuku(m);
        }
        System.out.println("------------------------------------------");
        System.out.println("Data keseluruhan buku : ");
        data.tampil();

        System.out.println("___________________________________________");
        System.out.println("Pencarian data berdasarkan judul buku : ");
        System.out.println("Masukkan judul buku yang dicari : ");
        System.out.print("Judul buku : ");
        String judulCari = input.nextLine(); 
        judulCari = input.nextLine(); 

       
        System.out.println("Menggunakan Sequential Search Berdasarkan Judul:");
        data.cariBukuJudulSequential(judulCari);

        
        data.sortDataByJudul();

       
        System.out.println("Menggunakan Binary Search Berdasarkan Judul:");
        data.cariBukuJudulBinary(judulCari);
    }
}
