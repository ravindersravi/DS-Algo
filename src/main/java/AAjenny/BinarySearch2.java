package AAjenny;

public class BinarySearch2 {
    public static void main(String[] args) {
        // int nums[] = {-1, 0, 3, 5, 9, 12};
        int nums[] = {2,5};
        int target = 5;
        int search = search(nums, target);
        System.out.println(search);
    }

    static int search(int nums[], int target) {
        int start = 0;
        int n = nums.length;
        if(n==1) return nums[0];
        int end =n-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid] && mid < n)
                return mid;
            else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
