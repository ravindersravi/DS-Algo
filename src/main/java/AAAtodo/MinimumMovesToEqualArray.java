package AAAtodo;

import java.util.Arrays;

// 462. Minimum Moves to Equal Array Elements II
public class MinimumMovesToEqualArray {
    public static void main(String[] args) {
        int nums[] = {1,10,2,9};
        int i = minMoves2(nums);
        System.out.println(i);
    }
    public static  int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1;
        int count = 0;
        while (i < j) {
            count += nums[j] - nums[i];
            i++;
            j--;
        }
        return count;
    }
}
