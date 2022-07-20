package Astriver;

public class FactorialOFN {
    public static void main(String[] args) {
        int factorial = factorial(4);
        System.out.println(factorial);
    }
    static int factorial(int n){
        if(n==1) return 1;
        return n*factorial(n-1);
    }
}
