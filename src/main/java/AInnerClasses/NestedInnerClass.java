package AInnerClasses;

class Outer1{
    private int amount=100;
    private void display(){
        System.out.println("this is private method");
    }

    class Inner1{
        public void show(){
            System.out.println("In a nested class method");
            System.out.println("amount" +amount);
            Outer1 outer1 = new Outer1();
            outer1.display();
        }
    }
}
public class NestedInnerClass {
    public static void main(String[] args) {
        Outer1.Inner1 inner1= new Outer1().new Inner1();
        inner1.show();
    }
}
