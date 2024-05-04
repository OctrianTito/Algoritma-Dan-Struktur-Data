public class Gudang22 {
    Barang22 [] tumpukan;
    int size, top;

    Gudang22(int kapasitas) {
        this.size = kapasitas;
        tumpukan = new Barang22[this.size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang22 brg) {
        if(!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal ! Tumoukan barang di Gudang sudah penuh");
        }
    }

    public Barang22 ambilBarang() {
        if (!cekKosong()) {
            Barang22 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang");
            System.out.println("Kode unik dalam biner : " + konversiDesimalKeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang22 lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang22 barangTeratas = tumpukan[top];
            System.out.println("Barnag Teratas : " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public void tampilkanTumpukanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang : ");
            for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong.");
        }
    }
    
    public String konversiDesimalKeBiner(int kode) {
        StackKonversi stack = new StackKonversi();
        while (kode != 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }

        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }

    public void lihatBarangTerbawah() {
        for(int i = 0; i < size; i++) {
            if(!cekKosong()) {
                System.out.println("Barang terbawah : " + tumpukan[i].nama + "\n");
                break;
            } else {
                System.out.println("Tumpukan barang kosong.");
            }
        }
    }

    public void cariKode(int code) {
        int a = -1;
        for (int i = 0; i < tumpukan.length; i++) {
            if (code == tumpukan[i].kode) {
                a = i;
                break;
            }
        }
        if (a == -1) {
            System.out.println("Barang Tidak Ditemukan");
        } else {
            System.out.println("Kode barang : " + code);
            System.out.println("Nama barang : " + tumpukan[a].nama);
            System.out.println("Kategori : " + tumpukan[a].kategori);
        }

    }
     public void cariNama(String cari) {
        int a = -1;
        for (int i = 0; i < tumpukan.length; i++) {
            if (cari.equalsIgnoreCase(tumpukan[i].nama)) {
                a = i;
                break;
            }
        }
        if (a == -1) {
            System.out.println("Barang Tidak Ditemukan");
        } else {
            System.out.println("Kode barang : " + tumpukan[a].kode);
            System.out.println("Nama barang : " + cari);
            System.out.println("Kategori : " + tumpukan[a].kategori);
        }
    }
}