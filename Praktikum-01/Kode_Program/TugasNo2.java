import java.util.Scanner;

public class TugasNo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Hitung Kecepatan");
            System.out.println("2. Hitung Jarak");
            System.out.println("3. Hitung Waktu");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    hitungKecepatan();
                    break;
                case 2:
                    hitungJarak();
                    break;
                case 3:
                    hitungWaktu();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    sc.close(); // Penutupan Scanner setelah pengulangan selesai
                    return; // Keluar dari program
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                    break;
            }
        }
    }

    static void hitungKecepatan() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jarak (meter): ");
        double s = sc.nextDouble();
        System.out.print("Masukkan waktu (detik): ");
        double t = sc.nextDouble();

        if (t == 0) {
            System.out.println("Waktu tidak boleh nol.");
        } else {
            double v = s / t;
            System.out.println("Kecepatan adalah: " + v + " m/s");
        }
    }

    static void hitungJarak() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kecepatan (m/s): ");
        double v = sc.nextDouble();
        System.out.print("Masukkan waktu (detik): ");
        double t = sc.nextDouble();

        if (v == 0) {
            System.out.println("Kecepatan tidak boleh nol.");
        } else {
            double s = v * t;
            System.out.println("Jarak adalah: " + s + " meter");
        }
    }

    static void hitungWaktu() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jarak (meter): ");
        double s = sc.nextDouble();
        System.out.print("Masukkan kecepatan (m/s): ");
        double v = sc.nextDouble();

        if (v == 0) {
            System.out.println("Kecepatan tidak boleh nol.");
        } else {
            double t = s / v;
            System.out.println("Waktu adalah: " + t + " detik");
        }
    }
}