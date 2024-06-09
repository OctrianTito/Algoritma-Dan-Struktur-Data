/**
 * GraphMatriks
 */
public class GraphMatriks22 {

    int vertex;
    int [][] matriks;

    public GraphMatriks22(int v) {
        vertex = v;
        matriks = new int[v][v];
    }

    public void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = 0;
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.println("Gedung " + (char) ('A' + i) + " : ");
            for (int j = 0; j <  vertex; j++) {
                if (matriks[i][j] != -1) {
                    System.out.print("Gedung " + (char) ('A' + j) + " (" + matriks[i][j] + " m), ");
                    }
                    }
            System.out.println();
            System.out.println("-----------------------------------------------------------------");
        }
    }

    public int hitungInDegree(int v) {
        int inDegree = 0;
        for (int i = 0; i < vertex; i++) {
            if (matriks[i][v] != 0) {
                inDegree++;
            }
        }
        return inDegree;
    }

    public int hitungOutDegree(int v) {
        int outDegree = 0;
        for (int j = 0; j < vertex; j++) {
            if (matriks[v][j] != 0) {
                outDegree++;
            }
        }
        return outDegree;
    }

    public int hitungDegree(int v) {
        return hitungInDegree(v) + hitungOutDegree(v);
    }

    public void printDegree() {
        for (int i = 0; i < vertex; i++) {
            System.out.println("Jumlah In-Degree dari Gedung " + (char) ('A' + i) + " : " + hitungInDegree(i));
            System.out.println("Jumlah Out-Degree dari Gedung " + (char) ('A' + i) + " : " + hitungOutDegree(i));
            System.out.println("Jumlah Degree dari Gedung " + (char) ('A' + i) + " : " + hitungDegree(i));
            System.out.println("-----------------------------------------------------------------");
        }
    }
}