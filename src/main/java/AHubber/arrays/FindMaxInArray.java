package AHubber.arrays;

import epam.Inte;

public class FindMaxInArray {
    public static void main(String[] args) {
        int a[] = {5,9,3,15,1,2,10};
     //   int min = findMin(a);``````````````````````````````````
      //  System.out.println(min);
        int secondMax = findSecondMax(a);
        System.out.println(secondMax);
    }
    public static int findSecondMax(int a[]){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                secondMax=max;
                max=a[i];
            }else if (a[i]>secondMax && a[i]!=max){
                secondMax=a[i];
            }
        }
        return secondMax;
    }

    public static int findMin(int a[]){
        int min =a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        return min;
    }
}
