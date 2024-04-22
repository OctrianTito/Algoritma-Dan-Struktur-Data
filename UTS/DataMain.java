import java.util.Scanner;
public class DataMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] data = {15, 13, 27, 12, 46, 36, 49, 41, 46, 12, 38, 18, 31, 43, 26, 18, 33};
        Sorting selection = new Sorting();

        Searching src = new Searching();

        do {
            System.out.println("Masukkan Pilihan Yang Anda Ingin Lakukan :");
            System.out.println("1. Sorting");
            System.out.println("2. Searching");
            System.out.print("Pilih Menu : ");
            int pilihan = sc.nextInt();
            sc.nextLine();
    
            String answer;
            switch (pilihan) {
                case 1:
                System.out.println("===============================================================");
                System.out.println("Data Awal Sebelum Di Sorting :");
                selection.printArr(data);
                System.out.println("===============================================================");
                System.out.println("Setelah dilakukan sorting dengan metode - Selection sort : ");
                selection.selectionsort(data);
                selection.printArr(data);
                System.out.println("===============================================================");
                break;

                case 2:
                System.out.println("Pencarian Data Dengan Metode - Sequential Search : ");
                System.out.println("===============================================================");
                System.out.print("Masukkan data yang dicari : ");
                int cari = sc.nextInt();
                selection.selectionsort(data);
                src.cariData(data, cari);
                System.out.println("===============================================================");
                break;

                default:
                System.out.println("Pilihan tidak tersedia");

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
