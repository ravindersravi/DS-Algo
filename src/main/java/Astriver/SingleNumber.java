package Astriver;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        int[] a = {4, 1, 2, 1, 2};
        int i = singleNumber(a);
        System.out.println(i);
    }

    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> num_frequences = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (!num_frequences.containsKey(nums[i])) {
                num_frequences.put(nums[i], 1);
            } else {
                num_frequences.put(nums[i], num_frequences.get(nums[i]) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : num_frequences.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (value == 1) {
                return key;
            }
        }
        return -1;
    }
}

/*
  int result =0;
        for(int i=0;i<a.length;i++){
            System.out.println("result : "+result);
           result = result^a[i];
            System.out.println("i value: "+result);
        }
        System.out.println(result);
 */
