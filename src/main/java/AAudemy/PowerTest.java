package AAudemy;

public class PowerTest {
    public static void main(String[] args) {
        double pow = Math.pow(2, 4);
        System.out.println(pow);
        int i = powerCalc(2, 4);
        System.out.println(i);
        int i1 = recurPowerCalc(2, 4);
        System.out.println(i1);

    }
    static int powerCalc(int a, int b){
        int ans=1;
        for(int i=1;i<=b;i++){
            ans*= a;
        }
        return ans;
    }
    static int recurPowerCalc(int a, int b){
        if(b==0){
            return 1;
        }
        return a*recurPowerCalc(a,b-1);
    }

}
