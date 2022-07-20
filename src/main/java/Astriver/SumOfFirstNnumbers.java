package Astriver;

public class SumOfFirstNnumbers {
    public static void main(String[] args) {
        int n =4;
        findSum(n,0);
        int sum = findSum(3);
        System.out.println(sum);
    }

    //paramerterised
    static void findSum(int n, int sum){
        if(n<1){
            System.out.println("sum of n values "+sum);
            return;
        }
        findSum(n-1,sum+n);
    }
    static int  findSum(int n){
        if(n==0){
            return 0;
        }

        int i = findSum(n - 1) + n;
        return i;
    }
}
