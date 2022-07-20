package AP;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {15, 16, 6, 8, 5};
        int[] bubble = insertionSort(a, a.length);
        System.out.println(Arrays.toString(bubble));
    }

    static int[] insertionSort(int a[], int n) {
        for (int i = 1; i < n; i++) {
           int j= i-1;
           int temp = a[i];
           while(j>=0 && a[j]>temp){
               a[j+1]=a[j];
               j--;
           }
           a[j+1]= temp;
        }
        return a;
    }
}
