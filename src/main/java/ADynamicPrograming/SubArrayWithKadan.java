package ADynamicPrograming;

public class SubArrayWithKadan {
    public static void main(String[] args) {
      int a[] = {-2,1,-3,4,-1,2,1,-5,4};
       // int a[] = {5,4,-1,7,8};
      // int a[] = {-2,-1};
     //  int a[] = {1,2,3,-2,5};
     //  int a[] = {-1,-2,-3,-4};
        int i = maxSumSubArray(a);
        System.out.println(i);
    }
    static int maxSumSubArray(int a[]){
        int maxSum=Integer.MIN_VALUE;
        int curSum =0;
        if(a.length==1 ){
            return a[0];
        }
        for(int i=0;i<a.length;i++){
            curSum = curSum+a[i];
            if(curSum>maxSum){
                maxSum=curSum;
            }
            if(curSum<0 ){
                curSum=0;
            }
        }
        return maxSum;
    }
}
