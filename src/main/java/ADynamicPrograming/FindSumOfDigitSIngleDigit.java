package ADynamicPrograming;
/*
Input : 1234
Output : 1
Explanation : The sum of 1+2+3+4 = 10,
              digSum(x) == 10
              Hence ans will be 1+0 = 1
 */
public class FindSumOfDigitSIngleDigit
{
    public static void main(String[] args) {
        int n =1234;
        System.out.println(digitSum(n));
    }
    static int digitSum(int n){
        int sum =0;
        while ((n>0 ||sum >9)){
            if(n==0){
                n=sum;
                sum=0;
            }
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}
