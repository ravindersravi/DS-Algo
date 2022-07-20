package AHubber.arrays;

public class ArrayUtil {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.printArray(new int[]{5,1,2,9,10});
        int[] resize = arrayUtil.resize(new int[]{5, 1, 2, 9, 10}, 10);
        System.out.println("the size of array after resize : "+ resize.length);
    }
    public int[] resize(int a[], int capacity){
        int temp[] = new int[capacity];
        for(int i:temp){
            temp[i]=a[i];
        }
        a = temp;
        return a;
    }

    public void printArray(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}
