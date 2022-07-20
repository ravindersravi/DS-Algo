package AAAtodo;

public class JumpGame {
    public static void main(String[] args) {
        //int a[] = {2,3,1,1,4};
        int a[] = {2,0,1,1,0,4};
        boolean b = canJump(a);
        System.out.println(b);
    }
    public static  boolean canJump(int[] nums) {
        int lastGoodIndexPosition = nums.length-1;
        for(int i= nums.length-1;i>=0;i--){

            if(i+nums[i]>=lastGoodIndexPosition){
                lastGoodIndexPosition=i;
            }

        }
        return lastGoodIndexPosition == 0;
    }
}
