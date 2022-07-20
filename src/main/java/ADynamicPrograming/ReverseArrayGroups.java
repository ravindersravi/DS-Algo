package ADynamicPrograming;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayGroups {
    public static void main(String[] args) {
        int size =5;
        int group =3;
      //  int a[] ={5,6,8,9};
        //Output: 8 6 5 9
//        N = 5, K = 3
    //     int a[] = {1,2,3,4,5};
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

//        Output: 3 2 1 5 4
         reverseGroup(a,group,size);
         StringBuffer str = new StringBuffer();
         for(int i=0;i<size;i++){
             str.append(a.get(i));
         }
    }
    static void reverseGroup(ArrayList<Integer> arr, int k, int n){  //3

        for(int i=0;i<n;i+=k){
            int left=i;
            int right= Math.min(i+k-1,n-1);
            int temp;
            while(left<right){
                temp=arr.get(left);
                arr.set(left,arr.get(right));
                arr.set(right,temp);
                left++;
                right--;
            }
        }







        
       /* for(int i=group-1;i>=0;i--){
            System.out.println(a[i]);
        }
        for(int i=a.length-1;i>=group;i--){
            System.out.println(a[i]);
        }*/
    }
}
