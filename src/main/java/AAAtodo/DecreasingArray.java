package AAAtodo;

public class DecreasingArray {
    public static void main(String[] args) {
        int a[] = {3, 4, 2, 3};  // false
        //  int a[] = {-1,4,2,3};  //true
        boolean b = checkPossibility(a);
        System.out.println(b);
    }

    public static boolean checkPossibility(int[] nums) {
        int cnt = 0;                                                                    //the number of changes
        for (int i = 1; i < nums.length && cnt <= 1; i++) {
            if (nums[i - 1] > nums[i]) {
                cnt++;
                if (i - 2 < 0 || nums[i - 2] <= nums[i])
                    nums[i - 1] = nums[i];                    //modify nums[i-1] of a priority
                else nums[i] = nums[i - 1];                                                //have to modify nums[i]
            }
        }
        return cnt <= 1;
    }
}


/*  int count=1;
        HashSet<Integer> hashset = new HashSet<>();
        for(int i=0;i<nums.length-1;i++){
            if(!hashset.contains(nums[i]) && nums[i]+1<=nums[i+1]){
                count++;
                hashset.add(nums[i]);
            }

        }
        if(count+1==nums.length){
            for(int i=1;i<nums.length;i++){

                if(nums[i]<nums[i-1]){
                    nums[i]=nums[i-1]+1;
                }
            }
            return true;
        }
        return false;
    }*/