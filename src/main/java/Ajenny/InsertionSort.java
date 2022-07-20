package Ajenny;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int a[] = {5,4,10,1,6,2};
        int n = 6;
        int[] ints = insertSort(a, n);
        System.out.println(Arrays.toString(ints));
    }
    static  int[] insertSort(int a[], int n){
        for(int i=1;i<n;i++){
            int temp = a[i];
            int j = i-1;
            while(j>=0 && a[j]> temp){
                a[j+1]= a[j];
                j--;
            }
            a[j+1] = temp;
        }
        return a;
    }
}
