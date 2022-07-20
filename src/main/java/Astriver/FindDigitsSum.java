package Astriver;

public class FindDigitsSum {
    public static void main(String[] args) {
        int n = 1234561;
        int sum = 0;
        int digitsSum = findDigitsSum(n, sum);
        System.out.println(digitsSum);
    }

    public static int findDigitsSum(int n, int sum) {

        if(n==0){
            return 0;
        }
        int digit = n%10;
        return digit+findDigitsSum(n/10,digit+sum);
       // return n == n % 10 ? sum + n : (findDigitsSum(n / 10, n % 10 + sum));  //12345 //1234 123 12 1

    }
}
