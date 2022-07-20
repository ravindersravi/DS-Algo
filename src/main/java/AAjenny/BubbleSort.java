package AAjenny;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {15, 16, 6, 8, 5};
        int[] bubble = bubble(a, a.length);
        System.out.println(Arrays.toString(bubble));
    }

    static int[] bubble(int a[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a;
    }
}
