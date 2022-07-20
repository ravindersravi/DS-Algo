package AAudemy;

import java.util.Arrays;
//wrong...\
public class Merge2SortedArrays {
    public static void main(String[] args) {
        int a[] = {0,3,4,31};
        int b[] = {4,6,30};
        int[] sorted = sorted(a, b);
        System.out.println(Arrays.toString(sorted));
    }
    static int[] sorted(int a[], int b[]){
        int n1 = a.length;
        int n2 = b.length;
        int temp[] = new int[n1+n2];
        int i=0, j=0,k=0;
       while(i<n1 && j<n2){
           if(a[i]<b[j]){
               temp[k] = a[i];
               k++;
               i++;
           }
           else{
               temp[k]= a[j];
               k++;
               j++;
           }
       }
       while (i<n1){
           temp[k++] = a[i++];
       }
        while (j<n2){
            temp[k++] = b[j++];
        }

        return temp;
    }

}
