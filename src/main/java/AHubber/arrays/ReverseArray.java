package AHubber.arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int a[] = {8,7,5,10,7,2};
        int[] ints = reverseArray(a, 0, a.length - 1);
        System.out.println(Arrays.toString(ints));
    }
    public static int[] reverseArray(int a[],int start, int end){
        while (start<end){
            int temp = a[end];
            a[end]= a[start];
            a[start]= temp;
            start++;
            end--;
        }
        return a;
    }
}
