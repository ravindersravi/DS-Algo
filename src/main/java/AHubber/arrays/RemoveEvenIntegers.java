package AHubber.arrays;

public class RemoveEvenIntegers {
    public static void main(String[] args) {
        int a[] ={3,2,4,7,10,6,5};
        removeElement(a);
    }
    public static int[] removeElement(int a[]){
        int oddCount =0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                oddCount++;
            }
        }
        int[] result = new int[oddCount];
        int idx=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                result[idx]=a[i];
                idx++;
            }
        }
        return result;
    }
}
