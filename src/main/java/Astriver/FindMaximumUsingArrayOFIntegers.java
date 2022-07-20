package Astriver;

public class FindMaximumUsingArrayOFIntegers {
    public static void main(String[] args) {
        int a[] = {4,3,6,7,0,9,2};
        int maxNumber = findMaxNumber(a);
        System.out.println(maxNumber);
    }
    public static int findMaxNumber(int a[]){
       return maximun(a,a.length-1);
    }
    public static int maximun(int a[], int i){
        if(i==0) return a[0];
        return Math.max(a[i],maximun(a,i-1));
    }
}
