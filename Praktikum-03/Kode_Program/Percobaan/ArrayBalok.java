import java.util.Scanner;
public class ArrayBalok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Balok [] blArray = new Balok[3];
        for (int j = 0; j < 3; j++) {
            blArray[j] = new Balok();
            System.out.println("Balok ke-" + (j+1));
            System.out.println("Masukkan Panjang : ");
            blArray[j].panjang = sc.nextInt();
            System.out.println("Masukkan Lebar : ");
            blArray[j].lebar = sc.nextInt();
            System.out.println("Masukkan Tinggi : ");
            blArray[j].tinggi = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Volume balok ke-" + (i+1) + " : " + blArray[i].hitungVolume());
        }
    }
}
