package Astriver;

import java.util.Arrays;

public class ReverseAnArrayUsingRecursion {
    public static void main(String[] args) {
        int a[] = { 4,5,7,8,23,45};
        int start = 0;
        int end = a.length-1;
                doRecursion(a, start, end);
                printArray(a);
    }
    static void doRecursion(int a[], int start, int end){
        if(start>=end) return ;
        int temp =a[start];
        a[start]=a[end];
        a[end]=temp;
          doRecursion(a,start+1, end-1);
    }
    static  void printArray(int a[]){
        for(int a1:a){
            System.out.print (a1+" ");
        }
    }

}
