package ADynamicPrograming;

public class ArrayRotationP2 {
    public static void main(String[] args) {
        int a[] ={1,3,5,7,9};
        int b[] = rotate(a,2);
        for(int i=0;i<b.length;i++)
            System.out.println(b[i]);
    }
    public static int[] rotate(int[]arr,int k){
        for(int i=0;i<k;i++){
            int temp= arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=temp;
        }
        return arr;
    }
}
