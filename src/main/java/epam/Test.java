package epam;

class A {
    private void printName() {
        System.out.println("value-A");
    }
}

class B extends A{
    public void printName(){
        System.out.println("Name-B");
    }
}
public class Test {
    public static void main(String[] args) {
        A a = new B();
        //aon.printName();
    }
}
