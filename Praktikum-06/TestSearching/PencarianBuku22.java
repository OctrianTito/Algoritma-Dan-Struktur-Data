class PencarianBuku22 {
    Buku listBk[] = new Buku[5];
    int idx;

    void tambahBuku(Buku m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Buku m : listBk) {
            m.tampilDataBuku();
        }
    }

    void cariBukuJudulSequential(String judulCari) {
        boolean found = false;
        for (Buku m : listBk) {
            if (m.judulBuku.equalsIgnoreCase(judulCari)) {
                m.tampilDataBuku();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Buku dengan judul '" + judulCari + "' tidak ditemukan.");
        }
    }

    void sortDataByJudul() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = i + 1; j < idx; j++) {
                if (listBk[i].judulBuku.compareToIgnoreCase(listBk[j].judulBuku) > 0) {
                    Buku temp = listBk[i];
                    listBk[i] = listBk[j];
                    listBk[j] = temp;
                }
            }
        }
    }

    void cariBukuJudulBinary(String judulCari) {
        int left = 0;
        int right = idx - 1;
        boolean found = false;
        int foundIndex = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (listBk[mid].judulBuku.equalsIgnoreCase(judulCari)) {
                found = true;
                foundIndex = mid; 
                right = mid - 1; 
            } else if (listBk[mid].judulBuku.compareToIgnoreCase(judulCari) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (found) {
            System.out.println("Buku dengan judul '" + judulCari + "' ditemukan pada indeks " + foundIndex);
            listBk[foundIndex].tampilDataBuku();
        } else {
            System.out.println("Buku dengan judul '" + judulCari + "' tidak ditemukan.");
        }
    }
    
}
