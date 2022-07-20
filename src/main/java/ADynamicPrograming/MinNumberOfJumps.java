package ADynamicPrograming;
//https://practice.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1/?page=1&status[]=unsolved&sortBy=submissions#
public class MinNumberOfJumps {
    public static void main(String[] args) {
        int n=11;
        int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int i = minJumps(arr);
        System.out.println(i);
    }
    static int minJumps(int[] arr){
        // your code here
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        Integer[] dp=new Integer[n];
        dp[n-1]=0;
        for(int i=n-2;i>=0;i--){
            int min=Integer.MAX_VALUE;
            for(int j=1;j<=arr[i]&&i+j<n;j++){
                if(dp[i+j]!=null&&dp[i+j]<min){
                    min=dp[i+j];
                }
            }
            if(min!=Integer.MAX_VALUE)
                dp[i]=min+1;
        }
        if(dp[0]==null)return -1;
        return dp[0];
    }
}
