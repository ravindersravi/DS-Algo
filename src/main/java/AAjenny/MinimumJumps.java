package AAjenny;

public class MinimumJumps {
    public static void main(String[] args) {
        int a[] = {2,3,1,1,4};

        int i = minJumps(a);
        System.out.println(i);
    }
    static int minJumps(int a[]){
        int lastGoodIndexPosition = a.length-1;

        for(int i=a.length-1;i>=0;i--){
            if(i+a[i]>=lastGoodIndexPosition){
                lastGoodIndexPosition=i;
            }
        }
        return lastGoodIndexPosition;

    }
}
