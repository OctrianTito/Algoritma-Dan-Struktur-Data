public class GraphMain {
    public static void main(String[] args) {
        // PERCOBAAN 2
        GraphMatriks22 gdg = new GraphMatriks22(4);
        gdg.makeEdge(0, 1, 50);
        gdg.makeEdge(1, 0, 60);
        gdg.makeEdge(1, 2, 70);
        gdg.makeEdge(2, 1, 80);
        gdg.makeEdge(2, 3, 40);
        gdg.makeEdge(3, 0, 90);
        gdg.printGraph();
        System.out.println("=======================================");
        System.out.println("Hasil setelah penghapusan edge");
        System.out.println("=======================================");
        gdg.removeEdge(2, 1);
        gdg.printGraph();

        System.out.println("=======================================");
        System.out.println("Degree, In-Degree, dan Out-Degree dari setiap vertex :");
        System.out.println("=======================================");
        gdg.printDegree();
    }
}