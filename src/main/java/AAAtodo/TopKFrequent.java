package AAAtodo;

import java.util.*;

public class TopKFrequent {
    public static void main(String[] args) {
        int []nums = {1,1,1,2,2,3};

        int k = 2;

        int[] ints = topKFrequent(nums, k);
        System.out.println(Arrays.toString(ints));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!hmap.containsKey(nums[i])) {
                hmap.put(nums[i], 1);
            } else {
                hmap.put(nums[i], hmap.get(nums[i]) + 1);
            }
        }
        LinkedHashMap<Integer, Integer> reverseSortedMap = new LinkedHashMap<>();

        hmap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));
        int a[] = new int[k];

        for (int i = 0; i <= a.length; i++) {
            a[i]= reverseSortedMap.get(i);
        }

        return a;
    }
}
