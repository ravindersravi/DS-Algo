package Ajenny;

import java.util.Arrays;

public class SelectionSOrt {
    public static void main(String[] args) {
        int a[] = {7, 4, 10, 8, 3, 1};
        int[] selection = selection(a);
        System.out.println(Arrays.toString(selection));
    }

    static int[] selection(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            if (min != i) {
                extracted1(a, i, min);
            }
        }
        return a;
    }

    private static void extracted1(int[] a, int i, int min) {
        int temp = a[i];
        a[i] = a[min];
        a[min] = temp;
    }

}
