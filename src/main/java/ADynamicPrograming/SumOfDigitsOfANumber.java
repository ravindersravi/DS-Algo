package ADynamicPrograming;

public class SumOfDigitsOfANumber {
    public static void main(String[] args) {
        int n =1293;
        System.out.println(getSum(n));
    }
    public static int getSum(int n){
        int sum =0;
        while (n!=0){
            System.out.println(sum +" 1 ");
            sum= sum+n%10;
            System.out.println(sum +" 2 ");
            n=n/10;
            System.out.println(n + " d " );
        }
        return sum;
    }
}
