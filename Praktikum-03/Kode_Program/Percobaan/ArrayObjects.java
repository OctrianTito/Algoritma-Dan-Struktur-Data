import java.util.Scanner;
public class ArrayObjects {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah persegi panjang : ");
        int i = sc.nextInt();
        PersegiPanjang [] ppArray = new PersegiPanjang[i];

        for (int j = 0; j < i; j++) {
            ppArray[j] = new PersegiPanjang();
            System.out.println("Persegi Panjang ke-" + (j+1));
            System.out.println("Masukkan Panjang : ");
            ppArray[j].panjang = sc.nextInt();
            System.out.println("Masukkan Lebar : ");
            ppArray[j].lebar = sc.nextInt();
        }
        for (int j = 0; j < i; j++) {
            System.out.println("Persegi Panjang ke-" + (j+1));
            System.out.println("Panjang : " + ppArray[j].panjang + ", Lebar : " + ppArray[j].lebar);
        }
    }
}