import java.math.BigDecimal;

public class BIGTest {
    public static void main(String[] args) {
        int n =100;
        BigDecimal clAmount = new BigDecimal("6000");
        BigDecimal approvedAmt = new BigDecimal("1000");
        //Boolean.TRUE.equals(iseenaduFlow) && payUHitValue != null
        //                &&  payUHitValue.equals(payUHit)
        //                && (finboxScore == null || finboxScore < finboxScoreValue)
        if(n>90 && n>95 && n==100&& n>971){
            approvedAmt = new BigDecimal(String.valueOf(clAmount)).min(approvedAmt);
            System.out.println(approvedAmt);
        }

    }
}
