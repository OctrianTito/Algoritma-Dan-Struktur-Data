import java.util.Scanner;
public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    Mahasiswa [] mhs = new Mahasiswa[3];
    for (int i = 0; i < 3; i++) {
        mhs[i] = new Mahasiswa();
        System.out.println("Masukkan data mahasiswa ke-" + (i+1) + " : ");
        System.out.println("Masukkan nama : ");
        mhs[i].nama = sc.next();
        System.out.println("Masukkan nim : ");
        mhs[i].nim = sc.nextLong();
        System.out.println("Masukkan jenis kelamin (P/L): ");
        mhs[i].jenisKelamin = sc.next().charAt(0);
        System.out.println("Masukkan ipk : ");
        mhs[i].ipk = sc.nextDouble();
    }

    for (int i = 0; i < 3; i++) {
        System.out.println("Nama\t: " + mhs[i].nama + "\nnim\t: " + mhs[i].nim + "\njenis kelamin : " + mhs[i].jenisKelamin + "\nipk\t: " + mhs[i].ipk);
    }

    for (int i = 0; i < 3; i++) {
        System.out.println("Data Mahasiswa ke-"+(i+1));
        System.out.println("Nama : " +mhs[i].nama + "\nNim : " + mhs[i].nim + "\nJenis Kelamin : " + mhs[i].jenisKelamin + "\nIpk : "+mhs[i].ipk);
    }

    System.out.println("Rata - Rata IPK Mahasiswa : " + rataRataIpk(mhs));
    System.out.println("Mahasiswa Dengan Nilai IPK Tertinggi "+"\nNama : " + ipktertinggi(mhs).nama + "\nNim : " + ipktertinggi(mhs).nim + "\nJenis kelamin : " + ipktertinggi(mhs).jenisKelamin + "\nIPK : " + ipktertinggi(mhs).ipk);
    }


    static double rataRataIpk (Mahasiswa[]mhs){
        double totalIpk = 0;
        for (int i = 0; i < 3; i++) {
            totalIpk += mhs[i].ipk;
        }
        return totalIpk / 3;
    }

    static Mahasiswa ipktertinggi (Mahasiswa[]mhs){
        Mahasiswa ipkTertinggi = mhs[0];
        for (int i = 0; i < 3; i++) {
            if (mhs[i].ipk > ipkTertinggi.ipk) {
                ipkTertinggi = mhs[i];
            }
        }
        return ipkTertinggi;
    }
}