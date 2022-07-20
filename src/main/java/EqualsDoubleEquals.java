import static javafx.scene.input.KeyCode.L;

public class EqualsDoubleEquals {
    public static void main(String[] args) {
        //int,float, double,long
        //string, boolean , object, atomic integer, bigdecimal
        //compare vs equals vs ==
        int i1 =10;
        int i2 =10;
        float j1 = 12.f;
        float j2 = 12.f;
        Double k1 = 12D;
        Double k2 = 12D;
        Long l1 = 1234L;
        Long l2 = 1234L;



        if(k1.equals(k2)){
            System.out.println("equals double");
        }
        if(k1.equals(k2)){
            System.out.println("equals double");
        }
        if(l1.equals(l2)) {
            System.out.println("equals long");
        }
        if(l1==l2) {
            System.out.println("equals long");
        }
    }
}
