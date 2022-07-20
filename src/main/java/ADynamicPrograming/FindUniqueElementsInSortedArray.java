package ADynamicPrograming;

//delete duplicate elements in an array
public class FindUniqueElementsInSortedArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,3,3,4,5,5};
        sortedArray(a);
    }
    static void sortedArray(int[] a){
        int i=0;
        while (i<a.length){
            int cur = a[i];
            int cnt =0;
            while(i<a.length && cur ==a[i]){
                cnt++;
                i++;
            }
            if(cnt ==1){
                System.out.print(cur+" ");
            }
        }
    }



       /* for(int i=1;i<a.length;i++){
            if(a[i]!=a[i-1]){
                System.out.println(a[i-1]);
            }
        }*/
}
