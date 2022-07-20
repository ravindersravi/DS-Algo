package AAneedClarity;

public class BitWiseXOR {

    public static void main(String[] args) {
        int a =25;
        int b =25;
       // System.out.println(a^b);
        int []nums = {2,9,90,2,1,90,9};
        int i = singleNumber(nums);
        System.out.println(i);
    }
/*
1 1 0
0 0 0

0 1 1
1 0 1
 */
    public static int singleNumber(int[] nums) {
        int result =0;
        for(int i =0;i <nums.length;i++){
            System.out.println(" i :"+i+" nums[i]: "+nums[i]);
            result = result^nums[i];
            System.out.println("result : "+result);
        }
        return result;
    }

}
