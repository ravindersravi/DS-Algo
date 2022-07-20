package AAneedClarity;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int nums1[] = {1,2,3,9,0,0,0};
        int m = 4;
        int []nums2 = {2,5,6};
        int n = 3;
        int[] merge = merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(merge));
    }
    public static int[] merge(int[] n1, int m, int[] n2, int n) {
        int tail1 = m-1, tail2 = n-1, arr = m+n-1;
        while(tail1>=0 && tail2>=0){
         //   System.out.println("1 :"+n1[tail1] +"|  2 :"+n2[tail2]);
            n1[arr--]=(n1[tail1]>n2[tail2])?n1[tail1--]: n2[tail2--];

        }
        while(tail2 >=0){
            n1[arr--] =n2[tail2--];
        }
        return n1;
    }
}
