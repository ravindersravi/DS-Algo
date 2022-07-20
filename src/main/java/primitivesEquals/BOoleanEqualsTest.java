package primitivesEquals;

import static java.lang.Boolean.TRUE;

public class BOoleanEqualsTest {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = TRUE;
        if(b1==b2){
            System.out.println("inside of boolean-1");
        }
        Boolean b3 = TRUE;
        Boolean b4 = true;
        Boolean b5 = new Boolean(true);
        if(b3==b4){
            System.out.println("inside of boolean -2");
        }
        if(b3.equals(b4)){
            System.out.println("inside of boolean -3");
        }
        if(b5.equals(b4) && b5.equals(b3)){
            System.out.println("inside of boolean -4");
        }
        if(b5==b3){
            System.out.println("inside of booleaN -5");
        }
        if(b4==b5){
            System.out.println("inside of booleaN -6");
        }


    }
}
