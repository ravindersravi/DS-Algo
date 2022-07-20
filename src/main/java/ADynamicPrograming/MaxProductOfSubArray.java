package ADynamicPrograming;

public class MaxProductOfSubArray {
    public static void main(String[] args) {
        int a[] = {-3,-1,-1};
        int i = maxProduct(a);
        System.out.println(i);
    }
    public static int maxProduct(int[] A) {
        int n = A.length,
                res = A[0],
                l = 0,
                r = 0;
        for (int i = 0; i < n; i++) {
            l =  (l == 0 ? 1 : l) * A[i];
            r =  (r == 0 ? 1 : r) * A[n - 1 - i];
            res = Math.max(res, Math.max(l, r));
        }
        return res;
    }
}



 //   int max_product = Integer.MIN_VALUE;
//        int cur =1;
//        for(int i=0;i<nums.length;i++){
//            cur= cur*nums[i];
//            if(cur>max_product){
//                max_product = cur;
//            }
//            if(cur==0 || cur<=0){
//                cur=1;
//            }
//
//
//        } return max_product;
