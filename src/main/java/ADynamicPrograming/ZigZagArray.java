package ADynamicPrograming;

import java.util.Arrays;

public class ZigZagArray {
    public static void main(String[] args) {
        int N = 7;
        int a[] = {4, 3, 7, 8, 6, 2, 1};
        //Output: 3 7 4 8 2 6 1
        int[] ints = zigZag(a, N);
        System.out.println(Arrays.toString(ints));
    }

    static int[] zigZag(int arr[], int n) {
        // code here
        int i = 0;
        int j = 1;

        while (i < n - 1 && j < n) {

            if ((i % 2 == 0 && arr[i] > arr[j]) || (i % 2 != 0 && arr[i] < arr[j])) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            i++;
            j++;
        }
        return arr;
    }
}
