import java.util.Scanner;
public class BangunRuangMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah bangun : ");
        int i = sc.nextInt();
        Kerucut [] bgn1 = new Kerucut[i];

        for (int j = 0; j < i; j++) {
            bgn1[j] = new Kerucut();
            System.out.println("Kerucut ke-" + (j+1));
            System.out.println("Masukkan jari - jari : ");
            bgn1[j].jariJari = sc.nextInt();
            System.out.println("Masukkan sisi miring : ");
            bgn1[j].sisiMiring = sc.nextInt();
        }

        for (int j = 0; j < i; j++) {
            System.out.println("Kerucut ke-" + (j+1));
            System.out.println("Luas: " + bgn1[j].hitungLuas() + " cm^2");
            System.out.println("Volume : " + bgn1[j].hitungVolume() + " cm^3");
        }
        
        Limas [] bgn2 = new Limas[i];
        for (int j = 0; j < i; j++) {
            bgn2[j] = new Limas();
            System.out.println("Limas ke-" + (j+1));
            System.out.println("Masukkan panjang sisi alas : ");
            bgn2[j].panjangSisiAlas = sc.nextInt();
            System.out.println("Masukkan tinggi : ");
            bgn2[j].tinggi = sc.nextInt();
        }

        for (int j = 0; j < i; j++) {
            System.out.println("Limas ke-" + (j+1));
            System.out.println("Luas: " + bgn2[j].hitungLuasLimas() + " cm^2");
            System.out.println("Volume : " + bgn2[j].hitungVolumeLimas() + " cm^3");
        }

        Bola [] bgn3 = new Bola[i];
        for (int j = 0; j < i; j++) {
            bgn3[j] = new Bola();
            System.out.println("Bola ke-" + (j+1));
            System.out.println("Masukkan jari - jari bola : ");
            bgn3[j].jariBola = sc.nextInt();
        }

        for (int j = 0; j < i; j++) {
            System.out.println("Limas ke-" + (j+1));
            System.out.println("Luas: " + bgn3[j].hitungLuasBola() + " cm^2");
            System.out.println("Volume : " + bgn3[j].hitungVolumeBola() + " cm^3");
        }
    }
}