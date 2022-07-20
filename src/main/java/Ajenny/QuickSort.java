package Ajenny;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int a[] = {6,3,9,5,2,8};
        quicksort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    static  void quicksort(int a[], int lb, int ub){
        if(lb<ub){
        int pi = partitions(a, lb, ub);
            System.out.println("--------------------------");
           quicksort( a,  lb,  pi-1);
           quicksort( a,  pi+1,  ub);
        }
    }
    static int partitions(int array[], int low, int high) {
        int pivot = array[high];
        int i = (low - 1);    // pointer for greater element

        // traverse through all elements    // compare each element with pivot
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                System.out.println("array[j] : "+array[j]+" pivot: "+pivot);

                // if element smaller than pivot is found    // swap it with the greater element pointed by i
                i++;
                System.out.println("i : "+i+" j :"+j);
                int temp = array[i];    // swapping element at i with element at j
                array[i] = array[j];
                array[j] = temp;
                System.out.println(Arrays.toString(array));
            }

        }

        // swapt the pivot element with the greater element specified by i
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // return the position from where partition is done
        return (i + 1);

    }

}
