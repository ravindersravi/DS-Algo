package indexTest;

import java.math.BigDecimal;

public class BigDecimalCompareTo {
    static BigDecimal approvedAmount = BigDecimal.valueOf(400);
    static BigDecimal valueFromTable = BigDecimal.valueOf(678);

    public static void main(String[] args) {
        if ( approvedAmount.compareTo(new BigDecimal(500)) < 0 ){
            approvedAmount = valueFromTable;
            System.out.println(approvedAmount);
        }
        System.out.println(approvedAmount +"dsdfsd");

    }
}
