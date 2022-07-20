package ALeet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/two-sum/
public class TwoSum {
   // Input: nums = [2,7,11,15], target = 9
   // Output: [0,1]
    public static void main(String[] args) {
        int nums[] = {25,7,2,15};
        int target = 9;
        int[] ints = getindexoftwoSum(nums, target);
        System.out.println(Arrays.toString(ints));
    }
    static int[] getindexoftwoSum(int nums[], int target){
        if(nums==null){
            return new int[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            Integer idx= map.get(nums[i]);
            System.out.println(idx);
            if(idx!=null) {
                return new int[]{idx,i};
            }
            else {
                map.put(target-nums[i],i);
            }
        }
        return new int[0];
    }
}
