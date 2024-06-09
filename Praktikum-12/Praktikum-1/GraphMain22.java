import java.util.Scanner;
public class GraphMain22 {
    public static void main(String[] args) throws Exception {
        Graph22 gedung = new Graph22(6);
        Scanner sc = new Scanner(System.in);
        int pilihan = -1;

        while (pilihan != 0) {
            System.out.println("Menu:");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Cek Edge");
            System.out.println("6. Update Jarak");
            System.out.println("7. Hitung Edge");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan gedung asal : ");
                    int asal = sc.nextInt();
                    System.out.print("Masukkan gedung tujuan : ");
                    int tujuan = sc.nextInt();
                    System.out.print("Masukkan jarak : ");
                    int jarak = sc.nextInt();
                    gedung.addEdge(asal, tujuan, jarak);
                    break;

                case 2:
                    System.out.print("Masukkan gedung asal : ");
                    asal = sc.nextInt();
                    System.out.print("Masukkan gedung tujuan : ");
                    tujuan = sc.nextInt();
                    gedung.removeEdge(asal, tujuan);
                    break;

                case 3:
                    System.out.print("Masukkan gedung asal : ");
                    asal = sc.nextInt();
                    gedung.degree(asal);
                    break;

                case 4:
                    gedung.printGraph();
                    break;

                case 5:
                    System.out.print("Masukkan gedung asal : ");
                    asal = sc.nextInt();
                    System.out.print("Masukkan gedung tujuan : ");
                    tujuan = sc.nextInt();
                    if (gedung.isTetangga(asal, tujuan)) {
                        System.out.println("Gedung " + (char) ('A' + asal) + " dan Gedung " + (char) ('A' + tujuan) + " bertetangga");
                    } else {
                        System.out.println("Gedung " + (char) ('A' + asal) + " dan Gedung " + (char) ('A' + tujuan) + " tidak bertetangga");
                    }
                    break;

                case 6:
                    System.out.print("Masukkan gedung asal : ");
                    asal = sc.nextInt();
                    System.out.print("Masukkan gedung tujuan : ");
                    tujuan = sc.nextInt();
                    System.out.print("Masukkan jarak baru : ");
                    jarak = sc.nextInt();
                    gedung.updateJarak(asal, tujuan, jarak);
                    break;

                case 7:
                    System.out.println("Jumlah edge di dalam graf : " + gedung.hitungEdge());
                    break;

                case 0:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }

    }
}
