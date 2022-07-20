package AGFG;

public class SearchElementInSortedArray {
    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 8, 9, 10};
        int n, key;
        n = arr.length - 1;
        key = 10;

        System.out.println("Index: " + binarySearch(arr, 0, n, key));
    }

    static int binarySearch(int a[], int start, int end, int target) {

        while (start <=end) {
            int mid = start + (end - start) / 2;
            if (a[mid] == target) return mid;
            else if (target <a[mid]) {
                end = mid - 1;
            } else if (target > a[mid]) {
                start = mid + 1;
            }
        }
        return -1;
    }
}
