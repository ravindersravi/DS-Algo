package Ajenny;

import java.util.Arrays;

public class QuickSortDemo1 {
    public static void main(String[] args) {
        int a[] = {6,3,9,5,2,8};
        quicksort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
    static void quicksort(int a[], int start, int end){
        if(start<end){
            int pi = sort(a,start,end);
            sort(a,pi+1,end);
            sort(a,start,pi-1);
        }
    }
    static int sort(int a[], int start, int end){
        int pivot = a[end];
        int i = start-1;
        for(int j=start;j<end;j++){
            if(a[j]<pivot){
                i++;
                int temp = a[j];
                a[j]=a[i];
                a[i]=temp;
            }
        }
        int temp = a[i+1];
        a[i+1]=a[end];
        a[end]=temp;
        return (i+1);
    }
}
