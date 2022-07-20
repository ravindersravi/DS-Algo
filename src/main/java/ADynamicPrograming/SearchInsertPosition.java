package ADynamicPrograming;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 2;
        int i = searchInsert(nums, target);
        System.out.println(i);
    }
    public static int searchInsert(int[] nums, int target) {
        int low=0, high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) high= mid-1;
            else low = mid+1;
        }
        return low;
    }
}
   /* public int searchInsert(int[] nums, int target) {
        int i=0;
        while(i<nums.length){
            if(nums[i]==target){
                return i;
            }
            i++;
        }
        if(i>1 && target<nums[i-1]){
            return i-1;
        }

        return 0;
    }*/