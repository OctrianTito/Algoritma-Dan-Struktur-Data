public class Searching {
    void cariData(int [] data, int cari) {
        boolean found = false;
        int idx = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == cari) {
                found = true;
                idx = i;
            }
        }
        if (found) {
            System.out.println("Data " + cari + " berada pada index ke- " + idx);
        } else {
            System.out.println("Data yang dicari tidak ditemukan");
        }
    }

    public void Searching() {

    }
}