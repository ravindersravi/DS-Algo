package ADynamicPrograming;

import java.util.Arrays;

public class CumulativeSum {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        int[] cumulativeSum = getCumulativeSum(a);
        System.out.println(Arrays.toString(cumulativeSum));
    }
    static int[] getCumulativeSum (int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sum+arr[i];
            sum= arr[i];
        }
        return arr;
    }
  /*  int[] getCumulativeSum (int[] arr) {
        int prefixSum[] = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            int prefix = 0;
            for(int j = 0; j <= i; j++) {
                prefix += arr[j];
            }
            prefixSum[i] = prefix;
        }
        return prefixSum;
    }*/
}
