package AAAtodo;

import java.util.Arrays;

public class ArrayShuffle {
    public static void main(String[] args) {
        int [] nums = {2,5,1,3,4,7};
        int n = 6;
        int[] shuffle = shuffle(nums, n);
        System.out.println(Arrays.toString(shuffle));
    }
    public static int[] shuffle(int[] nums, int n) {
        int a[] = new int[nums.length];
        int count =0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                a[count]=nums[i];
                count++;
            }
        }
        for(int i=0;i<n;i++){
            if(i%2!=0){
                a[count]=nums[i];
                count++;
            }
        }
        return a;
    }
}
