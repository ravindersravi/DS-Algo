package AAtutorialPoint;

public class PrintNumbers1ToN {
    public static void main(String[] args) {
        int n = 19;
        print(n);
        printNUmber(20);
    }
    public static void print(int n){
        for(int i=0;i<n;i++){
            System.out.print(i+", ");
        }
    }
    public static void printNUmber(int m){
        System.out.println();
        for(int i=0;i<=m;i++){
            if(i%2==0){
                System.out.print(i+", ");
            }
        }
    }
}
