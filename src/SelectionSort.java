public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {8, 7, 2, 3, 4, 5, 6};
        int index_min, temp;

        for (int i = 0; i <= a.length; i++) {
            index_min = i;
            for (int j = i + 1; j < a.length; j++) {

                if (a[j] < a[index_min]) {
                    index_min = j;
                }
            }
            if (index_min != i) {
                temp = a[i];
                a[i] = a[index_min];
                a[index_min] = temp;
            }
        }
        for (int k : a) {
            System.out.println(k);
        }
    }
}
