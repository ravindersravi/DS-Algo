package AAjenny;

public class SquareRoot {
    public static void main(String[] args) {
        int x = 8;
        int i = mySqrt(x);
        System.out.println(i);
    }
    static int mySqrt(int x){
        int start =1;
        int end = x;
        int res =0;

        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid <= x/mid){
                start = mid+1;
                res = mid;
            }
            else {
                end=mid-1;
            }
        }
        return res;
    }
}
