public class Faktorial {
    public int nilai;

    int faktorialBF(int n) {
        int fakto = 1;
        while (n > 0) {
            fakto *= n;
            n--;
        }
        return fakto;
    }

    int faktorialDC(int n) {
        if (n == 1) {
            return 1;
        } else {
            int fakto = n * faktorialDC(n - 1);
            return fakto;
        }
    }

    public Faktorial() {

    }
}