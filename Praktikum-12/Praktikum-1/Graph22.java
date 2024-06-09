public class Graph22 {
    int vertex;
    DoubleLinkedList list[];

    public Graph22(int v) {
        vertex = v;
        list = new DoubleLinkedList[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedList();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
        // if undirected graph
        // list[tujuan].addFirst(asal, jarak);
    }

    public void degree(int asal) throws Exception {
        int totalIn = 0, totalOut = 0;
        // inDegree
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    totalIn++;
                }
            }
        }
        // outDegree
        totalOut = list[asal].size();

        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + "\t: " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + "\t: " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + "\t: " + (totalIn + totalOut));
        // if undirected graph
        // System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + list[asal].size());
    }

    public void removeEdge(int asal, int tujuan) {
        for (int i = 0; i < vertex; i++) {
            if (i == tujuan) {
                list[asal].remove(tujuan);
            }
        }
    }
    public void removeAllEdge() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Gedung " + (char) ('A' + i) + " terhubung dengan: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + " m), ");
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    public boolean isTetangga(int asal, int tujuan) throws Exception {
        for (int i = 0; i < list[asal].size(); i++) {
            if (list[asal].get(i) == tujuan) {
                return true;
            }
        }
        return false;
    }

    public void updateJarak(int asal, int tujuan, int jarakBaru) {
        list[asal].updateJarak(tujuan, jarakBaru);
    }

    public int hitungEdge() {
        int count = 0;
        for (int i = 0; i < vertex; i++) {
            count += list[i].size();
        }
        return count;
    }
}
