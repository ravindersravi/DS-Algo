package ADynamicPrograming;

import java.util.Arrays;

public class MinimizeSumOfProduct {
    public static void main(String[] args) {
    int  N = 5;
        long    A[] = {6, 1, 9, 5, 4};
        long    B[] = {3, 4, 8, 2, 4};
  /*        Output:
        80
        Explanation:
        2*9+3*6+4*5+4*4+8*1
                =18+18+20+16+8
                = 80 is the minimum sum*/
        minValue(A,B,N);
    }
    public static long minValue(long a[], long b[], long n)
    {   Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        long sum=0;
        int j=(int)n-1;
        for(int i=0;i<n;i++)
        {
            sum+=a[i]*b[j];
            j=j-1;
        }
        return sum;

    }
}
