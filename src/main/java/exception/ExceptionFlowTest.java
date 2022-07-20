package exception;

public class ExceptionFlowTest {
    public static void main(String[] args) {
        int n=10;
        int m =0;
        int k = 0;
        if(n>0){
            try{
                 k = n/m;
            }
            catch (Exception e){
                System.out.println("inside exception block");
               // k = 5;
            }
        }
        System.out.println("k value: "+k);
    }
    public static int demo(){
        System.out.println("inside of demo method...");
        return 1;
    }
}
