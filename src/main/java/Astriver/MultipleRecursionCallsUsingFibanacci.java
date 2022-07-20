package Astriver;

public class MultipleRecursionCallsUsingFibanacci {
    public static void main(String[] args) {

        int fibonacci = fibonacci(7);
        System.out.println(fibonacci);
    }
    static int fibonacci(int n){
        if(n<=1) return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
