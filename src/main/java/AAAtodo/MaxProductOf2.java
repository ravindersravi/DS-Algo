package AAAtodo;

import java.util.Arrays;

public class MaxProductOf2 {
    public static void main(String[] args) {
        int nums []= {1,5,4,5};

        int maxproduct = maxproduct(nums);
        System.out.println(maxproduct);

    }
    public static int maxproduct(int [] nums){
        int min = Integer.MIN_VALUE;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            int max = (nums[i] - 1) *(nums[i-1] - 1) ;
            min = Math.max(max, min);
        }
        return min;
    }
}
