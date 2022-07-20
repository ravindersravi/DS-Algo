package primitivesEquals;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal(123);
        BigDecimal b2 = new BigDecimal(123);
        if(b1==b2){
            System.out.println("equlas method");
        }

    }
}
