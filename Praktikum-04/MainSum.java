import java.util.Scanner;
public class MainSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=======================================");
        System.out.print("Masukkan jumlah perusahaan : ");
        int cp = sc.nextInt();

        Sum [] sm = new Sum[cp];
        System.out.println("=======================================");
        for (int i = 0; i < cp; i++) {
            System.out.print("Masukkan jumlah bulan perusahaan ke- " + (i+1) + (" : "));
            int elm = sc.nextInt();
            sm[i] = new Sum(elm);
            for (int j = 0; j < elm; j++) {
                System.out.print("Masukkan untung bulan ke - " + (j+1) + " = ");
                sm[i].keuntungan[j] = sc.nextDouble();
            }
        }

        System.out.println("=================================================");
        System.out.println("Algoritma Brute Force");
        for(int i = 0; i < cp; i++) {
            System.out.println("Total Keuntungan Perusahaan Ke- " + (i+1) + " Selama " + sm[i].elemen + " Bulan adalah " + sm[i].totalBF(sm[i].keuntungan));
        }
        System.out.println("=================================================");
        System.out.println("Algoritma Divide and Conquer");
        for(int i = 0; i < cp; i++) {
            System.out.println("Total Keuntungan Perusahaan Ke- " + (i+1) + " Selama " + sm[i].elemen + " Bulan adalah " + sm[i].totalDC(sm[i].keuntungan, 0, sm[i].elemen - 1));
        } 
    }
}