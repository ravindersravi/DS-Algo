package epam;

class Derived{
    protected  void getDetails(){
        System.out.println("Derived class");
    }
}


public class Test1 extends Derived {
    public static void main(String[] args) {
        Derived d1 = new Derived();
        d1.getDetails();
    }
    protected final void getDetails(){
        System.out.println("Test class");
    }
}
