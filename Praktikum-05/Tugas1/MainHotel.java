import java.util.Scanner;

public class MainHotel {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HotelService rooms = new HotelService();
    Hotel h1 = new Hotel("Grand Mercure", "Malang", 680000, 3);
    Hotel h2 = new Hotel("Niagara", "Malang", 200000, 1);
    Hotel h3 = new Hotel("Horison", "Surabaya", 500000, 2);
    Hotel h4 = new Hotel("Grand Indonesia", "Jakarta", 900000, 4);
    Hotel h5 = new Hotel("JW Marriot", "Surabaya", 1250000, 5);

    rooms.tambah(h1);
    rooms.tambah(h2);
    rooms.tambah(h3);
    rooms.tambah(h4);
    rooms.tambah(h5);


    do {
        System.out.println("Data hotel sebelum sorting = ");
        System.out.println("=================================");
        rooms.tampilAll();
        System.out.println("=================================");
    
        System.out.println("Urutkan Hotel Berdasarkan :");
        System.out.println("1. Harga Termurah");
        System.out.println("2. Bintang Tertinggi");
        System.out.print("Pilih Menu : ");
        int pilihan = sc.nextInt();
        sc.nextLine();

        String answer;
        switch (pilihan) {
            case 1:
                System.out.println("Data hotel setelah sorting harga termurah");
                System.out.println("=================================");
                System.out.println("Bubblesort : ");
                rooms.bubblesort1();
                rooms.tampilAll();
                System.out.println("=================================");
                System.out.println("Selection sort : ");
                rooms.selectionsort1();
                rooms.tampilAll();
                System.out.println("=================================");
                break;
            
            case 2:
                System.out.println("Data hotel setelah sorting bintang tertinggi");
                System.out.println("=================================");
                System.out.println("Bubblesort : ");
                rooms.bubblesort2();
                rooms.tampilAll();
                System.out.println("=================================");
                System.out.println("Selection sort : ");
                rooms.selectionsort2();
                rooms.tampilAll();
                System.out.println("=================================");
                break;
            default:
            System.out.println("Mohon maaf menu yang anda pilih tidak tersedia");
                break;
        }
        
        System.out.print("Apakah ingin kembali ke menu? (ya/tidak?) : ");
        answer = sc.nextLine();

        if (answer.equalsIgnoreCase("ya")) {
            continue;
        } else {
            break;
        }
    } while (true);
    }
}
