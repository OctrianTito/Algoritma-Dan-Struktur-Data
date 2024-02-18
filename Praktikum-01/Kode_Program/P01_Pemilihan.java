import java.util.Scanner;

public class P01_Pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tugas, kuis, uts, uas;
        double rata;

        System.out.print("Masukkan nilai tugas anda : ");
        tugas = sc.nextInt();
        System.out.print("Masukkan nilai kuis anda : ");
        kuis = sc.nextInt();
        System.out.print("masukkan nilai UTS anda : ");
        uts = sc.nextInt();
        System.out.print("Masukkan nilai UAS anda : ");
        uas = sc.nextInt();

        rata = tugas * 0.2 + kuis * 0.2 + uts * 0.3 + uas * 0.4;
        System.out.println("Nilai total anda adalah = " + rata);

        if (rata >= 0 && rata <= 100) {
            if (rata > 80) {
                System.out.println("Nilai anda A");
            } else if (rata > 73) {
                System.out.println("Nilai anda B+");
            } else if (rata > 65) {
                System.out.println("Nilai anda B");
            } else if (rata > 60) {
                System.out.println("Nilai anda C+");
            } else if (rata > 50) {
                System.out.println("Nilai anda C");
            } else if (rata > 39) {
                System.out.println("Nilai anda D");
            } else {
                System.out.println("Nilai anda E");
            }
        }

        if (rata > 50) {
            System.out.println("ANDA LULUS");
        } else {
            System.out.println("ANDA TIDAK LULUS");
        }
    }
}