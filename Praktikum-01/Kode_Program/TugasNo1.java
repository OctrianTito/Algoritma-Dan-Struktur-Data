import java.util.Scanner;
public class TugasNo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char kode[] = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char kota[][] = {
        {'B','A','N','T','E','N'},
        {'J','A','K','A','R','T','A'},
        {'B','A','N','D','U','N','G'},
        {'C','I','R','E','B','O','N'},
        {'B','O','G','G','O','R'},
        {'P','E','K','A','L','O','N','G','A','N'},
        {'S','E','M','A','R','A','N','G'},
        {'S','U','R','A','B','A','Y','A'},
        {'M','A','L','A','N','G'},
        {'T','E','G','A','L'}
        };

        char find;
        System.out.print("Masukkan huruf plat yang ingin dicari (HURUF KAPITAL) : ");
        find = sc.next().charAt(0);

        System.out.println();
        cariKota(kode, kota, find);
    }

    static void cariKota(char array1[], char array2[][] ,char kodePlat) {
        int key = 0;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == kodePlat) {
                key = i;
                break;
            }
        }

        System.out.print("Kode Plat Tersebut Berasal Dari Kota : ");
        for (int i = 0; i < array2.length; i++) {
            if (key == i) {
                for (int j = 0; j < array2[i].length; j++) {
                    System.out.print(array2[i][j]);
                }
            }
        }
    }
}