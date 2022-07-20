package AAjenny;

import java.util.Arrays;

public class AMidTest {
    public static void main(String[] args) {
        int a[] = {1,4,5,2,9,7,8};
        int target =7;
        int n = a.length-1;
        int end = a[n];
        int start = a[0];
        System.out.println("start :"+start +" end : "+end);

        int extracted = extracted(end, start, target, a);
        System.out.println(a[extracted]+"sorting index is "+ extracted);
    }

    private static int extracted(int end, int start, int target, int a[]) {
        Arrays.sort(a);
        while (start < end) {
            int mid = (start + end) / 2;
            System.out.println(mid);
            if(target==a[mid]) return mid;
            else if(target<=mid){
                end =mid--;
            }
            else if(target>mid){
                start++;
            }

        }
        return -1;

    }
}
