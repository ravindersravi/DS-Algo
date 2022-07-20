package ADynamicPrograming;

import java.util.Arrays;

public class ArrayRotations {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;
        int n =7 ;
        int[] rotate = rotate(arr, d, n);
        System.out.println(Arrays.toString(rotate));
    }
    static  int[] rotate(int arr[],int d,int n){
        int temp[] = new int[n];
        for(int i=d;i<n;i++){
          temp[i-d]= arr[i];
        }
        for(int i=0;i<d;i++){
            temp[n-d+i]=arr[i];
        }

        return temp;
    }
}
