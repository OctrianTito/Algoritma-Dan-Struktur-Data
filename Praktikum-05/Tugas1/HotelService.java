public class HotelService {
    Hotel rooms [] = new Hotel[5];
    int idx;
    
    void tambah(Hotel H) {
        if (idx < rooms.length) {
            rooms[idx] = H;
            idx++;
        } else {
            System.out.println("Data Hotel Sudah Penuh!");
        }
    }

    void tampilAll() {
        for (int i = 0; i < idx; i++) {
            System.out.println("---------------------------------");
            System.out.println("Nama hotel : " + rooms[i].nama);
            System.out.println("Kota       : " + rooms[i].kota);
            System.out.println("Harga      : " + rooms[i].harga);
            System.out.println("Bintang    : " + rooms[i].bintang); 
            System.out.println("---------------------------------");
        }
    }

    void bubblesort1() {
        for (int i = 0; i < rooms.length-1; i++) {
            for (int j = 1; j < rooms.length; j++) {
                if (rooms[j].harga < rooms[i].harga) {
                    Hotel temp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = temp;
                }
            }
        }
    }

    void selectionsort1() {
        for (int i = 0; i < rooms.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < rooms.length; j++) {
                if (rooms[j].harga < rooms[idxMin].harga) {
                    idxMin = j;
                }
            }

            Hotel temp = rooms[idxMin];
            rooms[idxMin] = rooms[i];
            rooms[i] = temp;
        }
    }

    void bubblesort2() {
        for (int i = 0; i < rooms.length - 1; i++) {
            for (int j = 0; j < rooms.length - i - 1; j++) {
                if (rooms[j].bintang < rooms[j + 1].bintang) {
                    Hotel temp = rooms[j];
                    rooms[j] = rooms[j + 1];
                    rooms[j + 1] = temp;
                }
            }
        }
    }
    

    void selectionsort2() {
        for (int i = 0; i < rooms.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < rooms.length; j++) {
                if (rooms[j].bintang > rooms[idxMin].bintang) {
                    idxMin = j;
                }
            }

            Hotel temp = rooms[idxMin];
            rooms[idxMin] = rooms[i];
            rooms[i] = temp;
        }
    }
}
