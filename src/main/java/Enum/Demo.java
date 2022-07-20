package Enum;

public class Demo {
    public static void main(String[] args) {
        System.out.println(CLMStrategy.CLF.getValue());
        System.out.println(CLMStrategy.valueOf("CLF").getValue());
    }
}

 enum CLMStrategy {
     CLF(1),
     CLZ(2),
     CLI(3),
     CLD(4);

     private int value;

     private CLMStrategy(int value) {
         this.value = value;
     }

     public int getValue() {
         return this.value;
     }
}

