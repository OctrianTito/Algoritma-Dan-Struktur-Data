public class BukuMain22 {
    public static void main(String[] args) {
        Buku22 bk1 = new Buku22();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(20);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku22 bk2 = new Buku22 ("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();
    }
}