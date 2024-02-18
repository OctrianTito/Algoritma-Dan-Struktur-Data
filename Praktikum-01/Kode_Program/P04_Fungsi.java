import java.util.Scanner;
public class P04_Fungsi {
        static int[] hargaBunga = {75000, 50000, 60000, 10000};
    
        public static void pendapatanPerCabang(int[][] stockBunga) {
            System.out.println("Pendapatan per Cabang jika semua bunga habis terjual:");
            for (int i = 0; i < stockBunga.length; i++) {
                int totalPendapatan = 0;
                for (int j = 0; j < stockBunga[i].length; j++) {
                    totalPendapatan += stockBunga[i][j] * hargaBunga[j];
                }
                System.out.println("Cabang " + (i + 1) + ": Rp " + totalPendapatan);
            }
        }
    
        public static void stockPerBunga(int[][] stockBunga, int cabang) {
            System.out.println("Stock bunga di Cabang RoyalGarden " + cabang + ":");
            for (int j = 0; j < stockBunga[cabang - 1].length; j++) {
                System.out.println("Bunga " + (j + 1) + ": " + stockBunga[cabang - 1][j]);
            }
        }
    
        public static void penguranganStockBunga(int[][] stockBunga, int cabang, int[] pengurangan) {
            for (int i = 0; i < pengurangan.length; i++) {
                stockBunga[cabang - 1][i] += pengurangan[i];
            }
            System.out.println("Terdapat pengurangan stock bunga karena bunga mati di Cabang RoyalGarden " + cabang);
        }
    
        public static void main(String[] args) {
            int[][] stockBunga = {
                {10, 5, 15, 7},
                {6, 11, 9, 12},
                {2, 10, 10, 5},
                {5, 7, 12, 9}
            };
    
            pendapatanPerCabang(stockBunga);
    
            stockPerBunga(stockBunga, 4);
    
            int[] pengurangan = {-1, -2, 0, -5};
            penguranganStockBunga(stockBunga, 4, pengurangan);
    
            System.out.println("\nStock bunga di Cabang RoyalGarden 4 setelah pengurangan:");
            stockPerBunga(stockBunga, 4);
    }
}