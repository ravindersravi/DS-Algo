package ADynamicPrograming;

public class ArrayRotation {
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9};
        int n= arr.length;
        int k=2;
       // System.out.println(arr[n-2]);
        rotate(arr, n,k);
    }
    static void rotate(int[] arr, int n, int k){
       /* for(int j=n;j>n-k;j--){
            System.out.println(arr[j-1]);
        }*/
        for(int j=n-k;j<n;j++){
            System.out.println(arr[j]);
        }
        for(int j=0;j<n-k;j++){
            System.out.println(arr[j]);
        }
      /*  int temp = arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]= temp;
        System.out.println(Arrays.toString(arr));*/

    }
}
