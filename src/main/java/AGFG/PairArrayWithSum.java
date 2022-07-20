package AGFG;

import java.util.HashMap;
import java.util.Map;

public class PairArrayWithSum {
    public static void main(String[] args) {
        int A[] = {1, 5, 4, 3, 7, 9, 2};
        int n = A.length;
        int search = 7;
        int ans[] = findSum(A, n, search);
        System.out.println(Math.min(ans[0], ans[1]) + " " + Math.max(ans[0], ans[1]));
    }

    public static int[] findSum(int arr[], int n, int target) {
        int i, findElement;
        Map<Integer, Integer> mp = new HashMap<>();
        int result[] = {0, 0};
        for (i = 0; i < n; i++) {
            findElement = target - arr[i];
            if (mp.containsKey(findElement)) {
                result[0] = i - 1;
                result[1] = mp.get(findElement) - 1;
                break;
            } else mp.put(arr[i], i);
        }
        return result;
    }
}
