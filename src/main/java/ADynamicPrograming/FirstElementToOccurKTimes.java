package ADynamicPrograming;

import java.util.HashMap;

public class FirstElementToOccurKTimes {
    public static void main(String[] args) {
    int   N = 7, K = 2;
     int   A[] = {1, 7, 4, 3, 4, 8, 7};
     //   Output :
       // 4*/
        int firstElementKTime = firstElementKTime(A, N, K);
        System.out.println(firstElementKTime);
    }
    public static int firstElementKTime(int[] a, int n, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int b =a[i];
            if(map.containsKey(b)){
                int of = map.get(b);
                map.put(b,of+1);
            }else {
                map.put(b,1);
            }
            if(map.get(b)==k){
                return b;
            }
        }
        return -1;
    }
}
