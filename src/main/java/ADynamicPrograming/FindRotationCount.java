package ADynamicPrograming;

public class FindRotationCount {
    public static void main(String[] args) {
        int a[] = {15,18,2,3,6,12};
        int n = a.length;
        System.out.println(findRotationCount(a,n));
    }
    static int findRotationCount(int a[], int n){
        int min = a[0], min_index=0;
        for(int i=0;i<n;i++){
            if(min>a[i]){
                min=a[i];
                min_index=i;
            }
        }
        return min_index;
    }
}
