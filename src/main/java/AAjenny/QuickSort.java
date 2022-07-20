package AAjenny;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int a[] = {6, 3, 9, 5, 2, 8};
        quicksort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    static void quicksort(int a[], int start, int end) {
        if (start < end) {
            int pi = partition(a, start, end);
            partition(a, start, pi - 1);
            partition(a, pi + 1, end);
        }
    }

    static int partition(int a[], int start, int end) {
        int i = start - 1;
        int pivot = a[end];
        for (int j = start; j < end; j++) {
            if (a[j] <= pivot) {
                i++;
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }
        int temp = a[i + 1];
        a[i + 1] = a[end];
        a[end] = temp;
        return (i + 1);
    }

}
