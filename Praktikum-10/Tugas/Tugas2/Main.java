import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int pilihan, id, index;
        String judul;
        double rating;
        boolean run = true;

        do {
            System.out.println("====================================");
            System.out.println("DATA FILM LAYAR LEBAR");
            System.out.println("====================================");
            System.out.println("1. Tambah data awal");
            System.out.println("2. Tambah data akhir");
            System.out.println("3. Tambah data index tertentu");
            System.out.println("4. Hapus data pertama");
            System.out.println("5. Hapus data terakhir");
            System.out.println("6. Hapus data tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID film");
            System.out.println("9. Urut data rating film-DESCENDING");
            System.out.println("10. keluar");
            System.out.println("====================================");

            System.out.print("Masukkan pilihan nomor yang ingin dilakukan : ");
            pilihan = sc1.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan data film posisi awal");
                    System.out.print("ID film : ");
                    id = sc1.nextInt();
                    System.out.print("Judul film : ");
                    judul = sc2.nextLine();
                    System.out.print("Rating film : ");
                    rating = sc1.nextDouble();
                    dll.addFirst(id, judul, rating);
                    break;
                case 2:
                    System.out.println("Masukkan data film posisi akhir");
                    System.out.print("ID film : ");
                    id = sc1.nextInt();
                    System.out.print("Judul film : ");
                    judul = sc2.nextLine();
                    System.out.print("Rating film : ");
                    rating = sc1.nextDouble();
                    dll.addLast(id, judul, rating);
                    break;
                case 3:
                    System.out.print("Masukkan data film urutan ke : ");
                    index = sc1.nextInt();
                    System.out.print("ID film : ");
                    id = sc1.nextInt();
                    System.out.print("Judul film : ");
                    judul = sc2.nextLine();
                    System.out.print("Rating film : ");
                    rating = sc1.nextDouble();
                    System.out.println("Berhasil Ditambahkan!");
                    System.out.println("Data film ini akan masuk di urutan ke-" + index);
                    dll.addIndexOf(index, id, judul, rating);
                    break;
                case 4:
                    dll.removeFirst();
                    System.out.println("Film urutan pertama berhasil dihapus, silahkan cetak untuk melihat daftar film terbaru");
                    break;
                case 5:
                    dll.removeLast();
                    System.out.println("Film urutan terakhir berhasil dihapus, silahkan cetak untuk melihat daftar film terbaru");
                    break;
                case 6:
                    System.out.print("Masukkan urutan film yang akan dihapus : ");
                    index = sc1.nextInt();
                    dll.removeIndexOf(index - 1);
                    System.out.println("Film pada urutan ke-" + (index + 1) + " berhasil dihapus, silahkan cetak untuk melihat daftar film terbaru");
                    break;
                case 7:
                    dll.Print();
                    break;
                case 8:
                    System.out.print("Masukkan ID film yang dicari : ");
                    id = sc1.nextInt();
                    dll.cariIDFilm(id);
                    break;
                case 9:
                    dll.sortingRatingDesc();
                    dll.Print();
                    break;
                case 10:
                    run = false;
                    return;
                default:
                    System.out.println("Pilihan tidak valid");
            } 
        } while (run);
    }
}