package AGFG;

//: https://www.techiedelight.com/find-maximum-minimum-custom-objects-java/

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 1, 3, 5, 1 }; //[2,2,1,1,1,2,2]
        int n = arr.length;
        int i = majorityElement(arr);
        System.out.println(i);
    }
    public static int majorityElement(int[] nums) {
        int n =nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> hms : hm.entrySet())
            if(hms.getValue()>n/2){
                return hms.getKey();  //2
            }
        return -1;
    }

}

/*
 int arr[] = { 1, 1, 2, 1, 3, 5, 1 };
        int n = arr.length;
        findMajority(arr, n);
    }
    static void findMajority(int arr[], int n) {
        int maxCount = 0;
        int index = -1; // sentinels
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }


    }
*/
