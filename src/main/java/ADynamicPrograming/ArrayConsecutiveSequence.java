package ADynamicPrograming;

import java.util.Arrays;

public class ArrayConsecutiveSequence {
    public static void main(String[] args) {
        int arr[] = {5, 4, 2, 3, 1, 6};
         char c[] = {'a','b','d','c','e','f'};
        int n = arr.length;
        boolean b = areConsecutive(arr, n);
        System.out.println(b);
        boolean check = check(c);
        System.out.println(check);
    }
   static boolean areConsecutive(int a[], int n){
       Arrays.sort(a); //1,2,3,4,5,6
       for(int i=1;i<n;i++){
           if(a[i]!=a[i-1]+1){
               return false;
           }
          /* if(a[i]==a[i-1]+1){
               return true;
           }*/
       }
       return true;
    }
    static  boolean check(char c[]){
        int l = c.length;
        Arrays.sort(c);
        System.out.println(c);
        for(int i=1;i<l;i++){
            if(c[i]-c[i-1]!=1){
                return false;
            }
        }
        return true;
    }
}
