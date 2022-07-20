package AAAtodo;

import java.util.Arrays;

public class ArrayShuffle2 {
    public static void main(String[] args) {
     int nums[] = {2,5,1,3,4,7};
             int  n = 3   ;
        int[] shuffle = shuffle(nums, n);
        System.out.println(Arrays.toString(shuffle));
    }
    public static int[] shuffle(int[] nums, int n) {
        int a [] = new int[nums.length];

        int i=0;
        int j=0;
        while(i<n){
            a[j]=nums[i];  //2,  3,,  1
            a[j+1]=nums[i+n];
            i=i+1;
            j=j+2;
        }
        return a;
    }

}
   /* public int[] shuffle(int[] nums, int n) {
        int[] a = new int[nums.length];
        int i,j;
        for(i=0,j=0;j<n;i=i+2,j++)
        {
            a[i] = nums[j];
            a[i+1] = nums[j+n];
        }
        return a;
    }*/