import java.math.BigDecimal;

public class EqualsTest {
    public static void main(String[] args) {
        Integer payUHitValue = null;

//        if(payUHitValue==900){
//            System.out.println("de,mo-2");
//        }
//        if(1equals(payUHitValue)){
//            System.out.println("de,hjghjmo-2");
//        }
        String s = "123";
        BigDecimal approvedAmt = BigDecimal.ONE;
        BigDecimal creditlimitAssigned = new BigDecimal(s).min(approvedAmt);
        System.out.println(creditlimitAssigned);
    }
}
