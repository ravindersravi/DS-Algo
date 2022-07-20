package AAudemy;

import java.util.HashSet;
import java.util.Set;

public class SumPair {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 6, 8 };
        int sum = 14;
        System.out.println(hasSumWithPairV2(arr, sum));
    }
    static boolean hasSumWithPairV2(int a[], int sum){
        Set<Integer> complement = new HashSet<>();
        for(int i=0;i<a.length;i++){
            if(complement.contains(a[i]))
                return true;
            complement.add(sum-a[i]);
        }
        return false;
    }
}
