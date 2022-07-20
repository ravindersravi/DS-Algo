package ADynamicPrograming;

import java.util.Arrays;

public class Merge2SortedArrays {
    public static void main(String[] args) {
//        Input: arr1[] = { 1, 3, 4, 5}, arr2[] = {2, 4, 6, 8}
//        Output: arr3[] = {1, 2, 3, 4, 4, 5, 6, 8}
//        Input: arr1[] = { 5, 8, 9}, arr2[] = {4, 7, 8}
//        Output: arr3[] = {4, 5, 7, 8, 8, 9}
        int arr1[] = {1,3,4,5};
        int arr2[] = {2,4,6,8,9};
        int[] arrayMerge = sortedArrayMerge(arr1, arr2);
        System.out.println(Arrays.toString(arrayMerge));
    }
    static int[] sortedArrayMerge(int arr1[], int []arr2){
        int n1 = arr1.length;
        int n2= arr2.length;
        int[] arr3 = new int[n1+n2];
        int i = 0, j = 0, k = 0;
        while (i<n1 && j <n2)
        {
 // Check if current element of first array is smaller than current element of second array.
            // If yes, store first array element and increment first array
            // index. Otherwise do same with second array
            if (arr1[i] < arr2[j]){
                arr3[k] = arr1[i];
            k++;
            i++;}
            else{
                arr3[k] = arr2[j];
            k++;
            j++;
            }
        }

        // Store remaining elements of first array
        while (i < n1)
            arr3[k++] = arr1[i++];

        // Store remaining elements of second array
        while (j < n2)
            arr3[k++] = arr2[j++];
        return arr3;
    }
}
