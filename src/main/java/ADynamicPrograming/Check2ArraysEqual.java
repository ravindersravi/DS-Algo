package ADynamicPrograming;

import java.util.Arrays;

public class Check2ArraysEqual {
    // N = 5

// Output: 1
    public static void main(String[] args) {
        long A[] = {1,2,5,4,0};
        long B[] = {2,4,5,0,1};
        System.out.println(check(A,B,5) );
    }
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        int count =0;
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0;i<N;i++){
            if(A[i]==B[i]){
                count=count+1;
            }else{
                break;
            }
        }
        if(count==N){
            return true;
        }
        else {
            return false;
        }
    }
}
