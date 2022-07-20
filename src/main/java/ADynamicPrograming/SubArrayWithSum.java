package ADynamicPrograming;

import java.util.ArrayList;

public class SubArrayWithSum {
    public static void main(String[] args) {
        int size = 5, Sum = 12;
       int A[] = {1,2,3,7,5};
        System.out.println(subarraySum(A,size,Sum));

    }
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        // Your code here
        ArrayList<Integer> a = new ArrayList<Integer>();
        int i,j,sum,p;
        for(i=0;i<n;i++){
            sum=arr[i];
            for(j=i+1;j<=n;j++){
                if(sum==s){
                    a.add(i+1);
                    a.add(j);
                    return a;
                }
                if(sum>s || j==n){
                    break;
                }
                sum=sum+arr[j];
            }
        }
        a.add(-1);
        return a;
    }

}
