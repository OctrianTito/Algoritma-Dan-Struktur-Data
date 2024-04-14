public class MergeSorting22 {
    public void MergeSort(int [] data) {
        sort(data, 0, data.length - 1);
    }

    public void merge(int data[], int left, int mid, int right) {
        int [] temp = new int[data.length];
        for (int i = left; i <= right; i++) {
            temp[i] = data[i];
        }
        int a = left;
        int b = mid + 1;
        int c = left;

        while (a <= mid && b <= right) {
            if (temp[a] <= temp[b]) {
                data[c] = temp[a];
                a++;
            } else {
                data[c] = temp[b];
                b++;
            }
            c++;
        }
        int s = mid - a;
        for (int i = 0; i < s; i++) {
            data[c+1] = temp[a+1];
        }

        while (a <= mid) {
            data[c] = temp[a];
            c++;
            a++;
        }
    
    }

    public void sort(int data[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            sort(data, left, mid);
            sort(data, mid + 1, right);
            merge(data, left, mid, right);
        }
    }

    public void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}
