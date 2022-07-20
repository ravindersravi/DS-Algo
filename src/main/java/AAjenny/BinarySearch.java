package AAjenny;

public class BinarySearch {
    public static void main(String[] args) {
        int a[] = {1, 5, 6, 7, 9};
        int k = 7;
        int search = search(a, a.length, k);
        System.out.println(search);
    }

    static int search(int a[], int n, int k) {
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int mid = (left + right) / 2;

            if (k == a[mid]) {
                return mid;
            } else if (k < a[mid]) {
                right = mid - 1;
            } else if (k > a[mid]) {
                left = mid + 1;
            }
        }
        if (left > right) {
            return -1;
        }
        return -1;
    }
}