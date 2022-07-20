package AGFG;

public class FindTripletSum {
    public static void main(String[] args) {
        FindTripletSum triplet = new FindTripletSum();
        int A[] = {1, 4, 45, 6, 10, 8};
        int sum = 22;
        int arr_size = A.length;

        boolean numbers = triplet.find3Numbers(A, arr_size, sum);
        System.out.println(numbers);
    }

    boolean find3Numbers(int a[], int n, int sum) {
        int l, r;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (a[i] + a[j] + a[k] == sum) {
                        System.out.print("Triplet is " + a[i] + ", " + a[j] + ", " + a[k]);
                        return true;
                    }
                }
            }

        }
        return false;
    }
}
