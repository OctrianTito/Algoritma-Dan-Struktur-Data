public class Buku22 {
    String judul, pengarang;
    int halaman, stok, harga;
    int jumlah;

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang " + pengarang);
        System.out.println("Jumlah halaman " + halaman);
        System.out.println("Sisa stok : " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    void terjual(int jml) {
        this.jumlah = jml;
        if (stok > 0) {
            stok -= jml;
            if (stok < 0) {
                stok = 0;
            }
        } else {
            System.out.println("Maaf, stok sudah habis.");
        }
    }    

    void restock(int jml) {
        stok += jml;
    }
    void gantiHarga(int hrg) {
        harga = hrg;
    }

    public Buku22() {

    }

    public Buku22(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    int hitungHargaTotal() {
        int total = this.harga * jumlah;
        return total;
    }
    int hitungDiskon() {
        int diskon = 0;
        if (hitungHargaTotal() > 150000) {
            diskon = (int) (0.12 * hitungHargaTotal());
        } else if (hitungHargaTotal() >= 75000 && hitungHargaTotal() <= 150000) {
            diskon = (int) (0.05 * hitungHargaTotal());
        }
        return diskon;
    }
    int hitungHargaBayar() {
        System.out.print("Total Harga Buku: " + hitungHargaTotal());
        System.out.print("\nDiskon : " + hitungDiskon());
        int bayar = hitungHargaTotal() - hitungDiskon();
        System.out.print("\nTotal Harga Bayar : " + bayar);
        return bayar; 
    }
}