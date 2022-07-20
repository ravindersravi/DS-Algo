package ADynamicPrograming;

//leetcode problem

public class RemoveDuplicatesInSoretedArray {
    public static void main(String[] args) {
        int n[] = {1,1,1,2,3};
        int i = removeDuplicates(n);
        System.out.println(i);
    }
    static int removeDuplicates(int n[]){
        int j=1;
        for(int i=0;i<n.length-1;i++){
            if(n[i]!=n[i+1]){
                n[j]=n[i+1];
                j++;
            }
        }
        return j;
    }
}
