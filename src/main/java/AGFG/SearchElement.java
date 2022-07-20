package AGFG;

public class SearchElement {
    public static void main(String[] args) {
        int a[] = {12,34,10,6,40};
        int n = a.length;

        int target=40;
        int postition = findElement(a,n,target);
        System.out.println(postition);
    }
    public static int findElement(int a[], int n, int target){
        // since it is unsorted we can not do binary search
        for(int i=0;i<n;i++){
            if(a[i]==target){
                return i;
            }
        }
        return -1;
    }
}
