package Ajenny;

public class LinearSearch {
    public static void main(String[] args) {
        int a[] = {15, 5, 20, 35, 2, 42, 67, 17};
        int target = 42;
        int linear = linear(a, a.length, target);
        System.out.println(linear);

    }

    static int linear(int a[], int n, int target) {
        for (int i = 0; i < n; i++) {
            if (a[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
