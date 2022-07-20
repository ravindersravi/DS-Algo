package ADynamicPrograming;

import java.util.ArrayList;
import java.util.Arrays;

public class FindDuplicateInAnArray {
    public static void main(String[] args) {
        int n=4;
        int arr[] = {0,3,1,1,2};
        ArrayList<Integer> duplicates = duplicates(arr, n);
        System.out.println(duplicates);
    }
    static ArrayList<Integer> duplicates(int arr[], int n){
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        int lastOccurance = -1;
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1] ){
                list.add(arr[i]);
              //  lastOccurance = arr[i];
            }
        }
        if(list.size() ==0){
            list.add(-1);
            return list;
        }
        else {
            return list;
        }
    }
}
