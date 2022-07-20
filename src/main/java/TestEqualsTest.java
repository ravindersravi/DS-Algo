import java.math.BigDecimal;

public class TestEqualsTest {
    private static  Boolean iseenaduFlow = true;
    private static Integer payUHit=1;
    static Integer  payUHitValue = 1;
    private static Integer finboxScoreValue=100;
    static Float finboxScore = 50F;
    static BigDecimal approvedAmt = new BigDecimal("3453");
    private static String clAmount = "34342";

    public static void main(String[] args) {



        if (Boolean.TRUE.equals(iseenaduFlow) && payUHitValue != null
                &&  payUHitValue.equals(payUHit)
                && (finboxScore == null || finboxScore < finboxScoreValue)) {
            approvedAmt = new BigDecimal(clAmount).min(approvedAmt);
            System.out.println(approvedAmt);
        }
    }
}
