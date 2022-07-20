package AABasic;

public class CalculatingMidPoint {
    public static void main(String[] args) {
        int [] nums = {-10,-3,0,5,9};
        int start = nums[0];
        int end = nums[nums.length-1];
        int mid = start+(end-start)/2;
        System.out.println(mid);
    }
}
