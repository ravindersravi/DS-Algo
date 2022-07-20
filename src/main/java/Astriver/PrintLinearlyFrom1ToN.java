package Astriver;

public class PrintLinearlyFrom1ToN {
    public static void main(String[] args) {
        int i =1;
        int n=12;
    //    printer(n,i);
    //   recustionPrintForDP(50,n);
        recustionPrintForDPFromNto1(1,n);
    }
    static void printer(int n, int i){
        if(i>n){
            return;
        }
        if(i<=n){
            System.out.println("i :"+i);
            i++;
            printer(n,i);
        }
    }

    //without using i+1 condition & using recursion
    //It is also called back tracking..
    //print 1 to N
    public static void recustionPrintForDP(int i, int n){

        if(i<n)return;
        recustionPrintForDP(i-1,n);
        System.out.println("i value "+ i);

    }

    //print N to 1
    public static void recustionPrintForDPFromNto1(int i, int n){

        if(i>n)return;
        recustionPrintForDPFromNto1(i+1,n);
        System.out.println("KK value "+ i);

    }
}
