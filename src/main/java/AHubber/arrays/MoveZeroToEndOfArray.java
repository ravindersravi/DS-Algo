package AHubber.arrays;

import java.util.Arrays;

public class MoveZeroToEndOfArray {
    public static void main(String[] args) {
        int a[] = {0,1,0,4,12};
        int[] movement = movement(a);
        System.out.println(Arrays.toString(movement));
    }
    public static int[] movement(int a[]){
        int n =a.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(a[i]!=0 && a[j]==0){
                int temp = a[i];
                a[i]= a[j];
                a[j]= temp;
            }
            if(a[j]!=0){
                j++;
            }
        }
        return a;
    }
}
