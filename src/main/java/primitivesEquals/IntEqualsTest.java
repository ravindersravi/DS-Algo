package primitivesEquals;

import java.math.BigDecimal;

public class IntEqualsTest {
    public static void main(String[] args) {
        Integer i1 =10;
        Integer i2 =12;
        BigDecimal b1 = new BigDecimal(123);
        BigDecimal b2 = new BigDecimal(123);
        if(i1!=i2){
            System.out.println("equals int");
        }
        if(i1.compareTo(i2)!=0){
            System.out.println("equals float");
        }
        if(b1==b2){
            System.out.println("same big decimal");
        }
        if(b1==b2){
            System.out.println("not same big decimal");
        }
        if(b1.equals(b2)){
            System.out.println("same big");
        }
    }
}
