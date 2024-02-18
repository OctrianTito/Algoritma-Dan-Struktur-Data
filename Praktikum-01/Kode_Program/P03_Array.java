import java.util.Scanner;

public class P03_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String matkul[] = {"MATDAS", "CTPS", "DASPRO", "BAHASA INGGRIS", "PRAK DASPRO", "K3", "KTI", "PANCASILA"};
        int sks[] = new int[matkul.length];
        double nilai[] = new double[matkul.length];

        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        for (int i = 0; i < matkul.length; i++) {
            System.out.printf("----------------------------------------------------");
            System.out.println();
            System.out.print("Masukkan Nilai Angka untuk MK " + matkul[i] + "\t: ");
            nilai[i] = sc.nextDouble();
            System.out.print("Masukkan SKS : ");
            sks[i] = sc.nextInt();

            if (nilai[i] < 0 || nilai[i] > 100) {
                System.out.println("Mohon Maaf Nilai Yang Anda Masukkan Tidak Valid");
            }
        }

        String nilaiHuruf[] = new String[nilai.length];
        double bobotNilai[] = new double[nilai.length];

        for (int i = 0; i < nilaiHuruf.length; i++) {
            if (nilai[i] > 80 && nilai[i] <= 100) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4;
            } else if (nilai[i] > 73) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if (nilai[i] > 65) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3;
            } else if (nilai[i] > 60) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if (nilai[i] > 50) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2;
            } else if (nilai[i] > 39) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0;
            }
        }

        int jmlSks = 18;
        double jumlah = 0;
        for (int i = 0; i < nilai.length; i++) {
            jumlah += bobotNilai[i] * sks[i];
        }

        double ipSem = jumlah / jmlSks;

        System.out.println("==============================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==============================");
        System.out.printf("%-15s %-15s %-15s  %-15s \n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < matkul.length; i++) {
            System.out.printf("%-15s %-15.1f %-15s  %-15.1f \n", matkul[i], nilai[i], nilaiHuruf[i], bobotNilai[i]);
        }

        System.out.println("==============================");
        System.out.printf("IP Semester : %.2f", ipSem);
    }
}
