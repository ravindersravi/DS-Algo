package Enum;

import lombok.Getter;
import lombok.Setter;

public class EnumTest {
    public static void main(String[] args) {
        Demo2 demo = new Demo2();
        demo.setName("CheckoutV2");
        boolean equals = Journey.CheckoutV2.name().equals(demo.getName());
        System.out.println(equals);
    }
}

@Getter
@Setter
class Demo2{
    String name;
}
 enum Journey{
    CheckoutV2
}
