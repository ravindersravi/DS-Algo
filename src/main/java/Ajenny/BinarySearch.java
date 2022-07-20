package Ajenny;

public class BinarySearch {
    //sorted array
    public static void main(String[] args) {
        int a[] = {5,9,17,23,25,45,59,63,71,89};
        int target = 17;
        int n =a.length;

        int binary = binary(a, target, n);
        System.out.println("index value "+binary);
    }
    static int binary(int a[], int target, int n){
        int left =0;
        int right = n-1;
        while (left<right) {
            int mid = (left + right) / 2;
            if (target == a[mid]) {
                return mid;
            } else if (target < a[mid]) {
                right = mid - 1;
            //    binary(a, target, mid - 1);
            } else if (target > a[mid]) {
                left = mid + 1;
            }
        }

        if(left>right){
            return -1;
        }
        return -1;
    }
}

