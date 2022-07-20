package AAjenny;

public class LinearSearch {
    public static void main(String[] args) {
        int a[] = {5,6,3,4,1,9};
        int target =4;
        int search = search(a, a.length, target);
        System.out.println(search);
    }
    static int search(int a[], int n, int k){
        for(int i=0;i<n;i++){
            if(a[i]==k){
                return i;
            }
        }
        return 0;
    }
}
