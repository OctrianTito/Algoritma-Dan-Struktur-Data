public class Sorting {

    void selectionsort(int [] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int minIdx = i;
            for (int j = i+1; j < data.length; j++) {
                if (data[j] < data[minIdx]) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                int temp = data[minIdx];
                data[minIdx] = data[i];
                data[i] = temp;
            }
        }
    }

    public void printArr(int [] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i] + " ");
        }
    }

    public void Sorting() {
        
    }
}
