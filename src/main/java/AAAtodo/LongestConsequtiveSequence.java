package AAAtodo;

import java.util.HashSet;
import java.util.Set;

public class LongestConsequtiveSequence {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int i = longestSequence(nums);
        System.out.println("final"+i);
    }

    public static int longestSequence(int nums[]) {
        Set<Integer> hashSet = new HashSet<>();
        for (int a : nums)
            hashSet.add(a);
        int longestSteak = 0;

        for (int num : nums) {
            System.out.println(num-1);
            if (!hashSet.contains(num - 1)) {
                int currentNum = num;
                int currentSteak = 1;
                while (hashSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentSteak += 1;
                }
                longestSteak = Math.max(longestSteak, currentSteak);
            }
        }
        return longestSteak;

    }
}
