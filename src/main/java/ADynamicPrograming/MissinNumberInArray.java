package ADynamicPrograming;

public class MissinNumberInArray {
    public static void main(String[] args) {
        int N = 10;
        int A[] = {6,1,2,8,3,4,7,10,5};
        int i = MissingNumber(A, N);
        System.out.println(i);

    }
    static int MissingNumber(int array[], int n) {
        // Your Code Here
        if(n==1) return -1;

        int naturalNo = (n*(n+1))/2;
        int sum =0;
        for(int i=0;i<n-1;i++){
            sum+=array[i];
        }
        return naturalNo- sum;
    }
}
